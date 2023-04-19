package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.mapper.*;
import gov.iti.jets.web.persistence.daos.implementation.CustomerDaoImplement;
import gov.iti.jets.web.persistence.entity.*;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServices {
    private CustomerDaoImplement customerDao;
    private CustomerMapper mapper;

    public CustomerServices() {
        customerDao = new CustomerDaoImplement();
        mapper = Mappers.getMapper(CustomerMapper.class);
    }

    public List<CustomerDto> getAllCustomer() {
        List<Customer> customers = customerDao.getAll();
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer customer : customers) {
            customerDtos.add(mapper.toDto(customer));
        }
        return customerDtos;
    }

    public CustomerDto getCustomerById(int id) {
        Customer customer = customerDao.getById(Customer.class , id);
        return mapper.toDto(customer);
    }

    public void addCustomer(CustomerUpdateDto customerDto) {
        CustomerUpdateMapper mapper = Mappers.getMapper(CustomerUpdateMapper.class);
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        customerDto.setCreateDate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()));
        customerDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()));
        Customer customer = mapper.toEntity(customerDto);
        customerDao.add(customer);
    }

    public void updateCustomer(CustomerUpdateDto customerDto) {

        CustomerUpdateMapper mapper = Mappers.getMapper(CustomerUpdateMapper.class);
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        customerDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()));
        Customer customer = mapper.toEntity(customerDto);
        customerDao.update(customer);
    }

    public AddressDto getCustomerAddress(int id) {

        AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);
        Address address = customerDao.getCustomerAddress(id);
        return addressMapper.toDto(address);
    }

    public StoreDto getCustomerStore(int id) {
        StoreMapper storeMapper = Mappers.getMapper(StoreMapper.class);
        Store store = customerDao.getCustomerStore(id);

        return storeMapper.toDto(store);
    }

    public List<PaymentDto> getCustomerPayments(int id) {
        PaymentMapper paymentMapper = Mappers.getMapper(PaymentMapper.class);
        List<Payment> Payments = customerDao.getCustomerPayments(id);
        List<PaymentDto> paymentDtos = new ArrayList<>();
        for (Payment payment : Payments) {
            paymentDtos.add(paymentMapper.toDto(payment));
        }
        return paymentDtos;
    }

    public List<RentalDto> getCustomerRents(int id) {
        RentalMapper rentalMapper = Mappers.getMapper(RentalMapper.class);
        List<Rental> rentals = customerDao.getCustomerRentals(id);
        List<RentalDto> rentalDtos = new ArrayList<>();
        for (Rental r : rentals
        ) {
            rentalDtos.add(rentalMapper.toDto(r));
        }
        return rentalDtos;
    }

}
