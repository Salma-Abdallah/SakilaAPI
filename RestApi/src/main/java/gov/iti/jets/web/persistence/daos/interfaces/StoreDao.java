package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.*;

import java.util.List;

public interface StoreDao {
    public List<Film> getStoreFilms(int id);
    public Staff getStoreManager(int id);
    public List<Staff> getStoreStaff(int id);
    public List<Customer> getStoreCustomers(int id);
    public Address getStoreAddress(int id);
    public List<Rental> getStoreRentals(int id);
}
