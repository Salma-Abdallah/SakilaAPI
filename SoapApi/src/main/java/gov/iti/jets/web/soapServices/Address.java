package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.services.AddressServices;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Address {
    private AddressServices addressServices;

    public Address() {
        addressServices = new AddressServices();
    }

    public List<AddressDto> getAllAddresses() {
        return addressServices.getAllAddresses();
    }

    public AddressDto getAddressById(int id) {
        return addressServices.getAddressById(id);
    }

    public void addAddress(AddressUpdateDto addressDto) {
        addressServices.addAddress(addressDto);
    }

    public void updateAddress(AddressUpdateDto addressDto) {
        addressServices.updateAddress(addressDto);
    }

    public List<StoreDto> getStoreByAddressId(int id) {
        return addressServices.getStoreByAddressId(id);
    }

    public List<StaffDto> getStaffByAddressId(int id) {
        return addressServices.getStaffByAddressId(id);
    }

    public List<CustomerDto> getCustomerByAddress(int id) {
        return  addressServices.getCustomerByAddress(id);
    }
}
