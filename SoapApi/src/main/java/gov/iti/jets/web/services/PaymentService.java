package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.PaymentDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.mapper.CustomerMapper;
import gov.iti.jets.web.mapper.PaymentMapper;
import gov.iti.jets.web.mapper.StaffMapper;
import gov.iti.jets.web.persistence.daos.implementation.PaymentDaoImplement;
import gov.iti.jets.web.persistence.entity.Payment;
import org.mapstruct.factory.Mappers;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;

public class PaymentService {
    private PaymentDaoImplement paymentDao;
    private PaymentMapper mapper;

    public PaymentService() {
        paymentDao = new PaymentDaoImplement();
        mapper = Mappers.getMapper(PaymentMapper.class);
    }

    public List<PaymentDto> getAllPayments() {
        List<Payment> payments = paymentDao.getAll();
        List<PaymentDto> paymentDtos = new ArrayList<>();
        for (Payment s : payments) {
            paymentDtos.add(mapper.toDto(s));
        }
        return paymentDtos;
    }
    public PaymentDto getPaymentById(int id) {
        Payment payment = paymentDao.getById(Payment.class,id);
        return mapper.toDto(payment);
    }

    public void addPayment(PaymentDto paymentDto){
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        paymentDto.setPaymentDate(Instant.now());
        paymentDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Payment payment = mapper.toEntity(paymentDto);
        paymentDao.add(payment);
    }

    public void updatePayment(PaymentDto paymentDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        paymentDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        paymentDto.setPaymentDate(Instant.now());
        Payment payment = mapper.toEntity(paymentDto);
        paymentDao.update(payment);
    }

    public BigDecimal getMaxPayment() {
        return paymentDao.getMaxPayment();
    }
    public BigDecimal getMinPayment() {
        return paymentDao.getMinPayment();
    }

    public StaffDto getStaffByPayment(int id) {
        StaffMapper staffMapper = Mappers.getMapper(StaffMapper.class);
        return staffMapper.toDto(paymentDao.getStaffByPayment(id));
    }

    public CustomerDto getCustomerByPayment(int id) {
        CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
        return customerMapper.toDto(paymentDao.getCustomerByPayment(id));
    }
}
