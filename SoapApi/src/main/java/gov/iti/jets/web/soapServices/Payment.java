package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.PaymentDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.services.PaymentService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.math.BigDecimal;
import java.util.List;

@WebService
public class Payment {
    private PaymentService paymentService;

    public Payment() {
        paymentService = new PaymentService();
    }

    @WebResult(name="Payments")
    public List<PaymentDto> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @WebResult(name="Payment")
    public PaymentDto getPaymentById(@WebParam(name = "id") int id) {
        return paymentService.getPaymentById(id);
    }

    public void addPayment(@WebParam(name = "payment") PaymentDto paymentDto) {
        paymentService.addPayment(paymentDto);
    }

    public void updatePayment(@WebParam(name = "payment") PaymentDto paymentDto) {
        paymentService.updatePayment(paymentDto);
    }

    @WebResult(name="MaxPayment")
    public BigDecimal getMaxPayment() {
        return paymentService.getMaxPayment();
    }

    @WebResult(name="MinPayment")
    public BigDecimal getMinPayment() {
        return paymentService.getMinPayment();
    }

    @WebResult(name="Staff")
    public StaffDto getStaffByPayment(@WebParam(name = "id") int id) {
        return paymentService.getStaffByPayment(id);
    }

    @WebResult(name="Customer")
    public CustomerDto getCustomerByPayment(@WebParam(name = "id") int id) {
        return paymentService.getCustomerByPayment(id);
    }
}
