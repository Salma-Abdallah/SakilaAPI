package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Inventory;
import gov.iti.jets.web.persistence.entity.Staff;

public interface RentalDao {
    public Inventory getInventoryByRent(int id);
    public Staff getStaffByRent(int id);
    public Customer getCustomerByRent(int id);
}
