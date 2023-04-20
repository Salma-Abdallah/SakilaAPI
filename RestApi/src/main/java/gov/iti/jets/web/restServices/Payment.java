package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.PaymentDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.services.PaymentService;

import java.math.BigDecimal;
import java.util.List;

public class Payment {
    private PaymentService paymentService;

    public Payment() {
        paymentService = new PaymentService();
    }

    public List<PaymentDto> getAllPayments() {
        return paymentService.getAllPayments();
    }

    public PaymentDto getPaymentById(int id) {
        return paymentService.getPaymentById(id);
    }

    public void addPayment(PaymentDto paymentDto) {
        paymentService.addPayment(paymentDto);
    }

    public void updatePayment(PaymentDto paymentDto) {
        paymentService.updatePayment(paymentDto);
    }

    public BigDecimal getMaxPayment() {
        return paymentService.getMaxPayment();
    }
    public BigDecimal getMinPayment() {
        return paymentService.getMinPayment();
    }

    public StaffDto getStaffByPayment(int id) {
        return paymentService.getStaffByPayment(id);
    }
    public CustomerDto getCustomerByPayment(int id) {
        return paymentService.getCustomerByPayment(id);
    }
}
