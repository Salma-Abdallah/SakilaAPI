package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.services.CustomerServices;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Customer {
    private CustomerServices customerServices;

    public Customer() {
        customerServices = new CustomerServices();
    }

    @WebResult(name="Customers")
    public List<CustomerDto> getAllCustomer() {
        return customerServices.getAllCustomer();
    }

    @WebResult(name="Customer")
    public CustomerDto getCustomerById(@WebParam(name="id") int id){
        return customerServices.getCustomerById(id);
    }

    public void addCustomer(@WebParam(name="customer") CustomerUpdateDto customerDto) {
        customerServices.addCustomer(customerDto);
    }

    public void updateCustomer(@WebParam(name="customer") CustomerUpdateDto customerDto) {
        customerServices.updateCustomer(customerDto);
    }

    @WebResult(name="Address")
    public AddressDto getCustomerAddress(@WebParam(name="id") int id) {
        return customerServices.getCustomerAddress(id);
    }

    @WebResult(name="Store")
    public StoreDto getCustomerStore(@WebParam(name="id") int id) {
        return customerServices.getCustomerStore(id);
    }

    @WebResult(name="Payments")
    public List<PaymentDto> getCustomerPayments(@WebParam(name="id") int id) {
        return customerServices.getCustomerPayments(id);
    }

    @WebResult(name="Rentals")
    public List<RentalDto> getCustomerRents(@WebParam(name="id") int id) {
        return customerServices.getCustomerRents(id);
    }
}
