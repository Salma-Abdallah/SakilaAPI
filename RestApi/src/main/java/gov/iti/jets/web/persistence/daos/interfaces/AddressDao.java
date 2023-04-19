package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Staff;
import gov.iti.jets.web.persistence.entity.Store;

import java.util.List;

public interface AddressDao {

    public List<Store> getStoreByAddressId( int id);
    public List<Customer> getCustomerByAddressId(int id);
    public List<Staff> getStaffByAddressId(int id);
}
