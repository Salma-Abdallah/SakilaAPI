package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.services.CustomerServices;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Customer {
    private CustomerServices customerServices;

    public Customer() {
        customerServices = new CustomerServices();
    }

    public List<CustomerDto> getAllCustomer() {
        return customerServices.getAllCustomer();
    }

    public CustomerDto getCustomerById(int id){
        return customerServices.getCustomerById(id);
    }

    public void addCustomer(CustomerUpdateDto customerDto) {
        customerServices.addCustomer(customerDto);
    }

    public void updateCustomer(CustomerUpdateDto customerDto) {
        customerServices.updateCustomer(customerDto);
    }

    public AddressDto getCustomerAddress(int id) {
        return customerServices.getCustomerAddress(id);
    }

    public StoreDto getCustomerStore(int id) {
        return customerServices.getCustomerStore(id);
    }

    public List<PaymentDto> getCustomerPayments(int id) {
        return customerServices.getCustomerPayments(id);
    }

    public List<RentalDto> getCustomerRents(int id) {
        return customerServices.getCustomerRents(id);
    }
}
