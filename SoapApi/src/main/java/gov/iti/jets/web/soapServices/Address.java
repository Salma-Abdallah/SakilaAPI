package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.services.AddressServices;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Address {
    private AddressServices addressServices;

    public Address() {
        addressServices = new AddressServices();
    }

    @WebResult(name="addresses")
    public List<AddressDto> getAllAddresses() {
        return addressServices.getAllAddresses();
    }

    @WebResult(name="address")
    public AddressDto getAddressById(@WebParam(name = "id") int id) {
        return addressServices.getAddressById(id);
    }

    public void addAddress(@WebParam(name = "address") AddressUpdateDto addressDto) {
        addressServices.addAddress(addressDto);
    }

    public void updateAddress(@WebParam(name = "address") AddressUpdateDto addressDto) {
        addressServices.updateAddress(addressDto);
    }

    @WebResult(name="Stores")
    public List<StoreDto> getStoreByAddressId(@WebParam(name = "id") int id) {
        return addressServices.getStoreByAddressId(id);
    }

    @WebResult(name="Staff")
    public List<StaffDto> getStaffByAddressId(@WebParam(name = "id") int id) {
        return addressServices.getStaffByAddressId(id);
    }

    @WebResult(name="Customers")
    public List<CustomerDto> getCustomerByAddress(@WebParam(name = "id") int id) {
        return  addressServices.getCustomerByAddress(id);
    }
}
