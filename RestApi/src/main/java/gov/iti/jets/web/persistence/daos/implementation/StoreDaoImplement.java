package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.StoreDao;
import gov.iti.jets.web.persistence.entity.*;
import jakarta.persistence.Query;

import java.util.List;

public class StoreDaoImplement extends BaseDaoImplement<Store , Integer> implements StoreDao {


    @Override
    public List<Film> getStoreFilms(int id) {
        String query="select f from Film f join  Inventory i where i.store.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);

        List<Film> films = (List<Film>) q.getResultList();
        return films;
    }

    @Override
    public Staff getStoreManager(int id) {
        String query="select c.managerStaff from Store c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Staff manager =(Staff) q.getSingleResult();

        return manager;
    }

    @Override
    public List<Staff> getStoreStaff(int id) {
        String query="from Store c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        List<Staff> staff =(List<Staff>) q.getResultList();

        return staff;
    }

    @Override
    public List<Customer> getStoreCustomers(int id) {
        String query="from Store c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        List<Customer> customers =(List<Customer>) q.getResultList();

        return customers;
    }

    @Override
    public Address getStoreAddress(int id) {
        String query="from Store s where s.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Address address = (Address) q.getSingleResult();

        return address;
    }

    @Override
    public List<Rental> getStoreRentals(int id) {
        String query="select r from Rental r join  Inventory i where   r.inventory.id=i.id  and i.store.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        List<Rental> rentals =(List<Rental>) q.getResultList();

        return rentals;
    }
}
