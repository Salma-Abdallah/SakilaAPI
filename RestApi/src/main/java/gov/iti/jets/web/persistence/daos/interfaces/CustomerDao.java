package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Payment;
import gov.iti.jets.web.persistence.entity.Rental;
import gov.iti.jets.web.persistence.entity.Store;

import java.util.List;

public interface CustomerDao {
    public Address getCustomerAddress(int id);
    public Store getCustomerStore(int id);
    public List<Payment> getCustomerPayments(int id);
    public List<Rental> getCustomerRentals(int id);
}
