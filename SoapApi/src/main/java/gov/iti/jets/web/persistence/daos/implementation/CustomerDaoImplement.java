package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.CustomerDao;
import gov.iti.jets.web.persistence.entity.*;
import jakarta.persistence.Query;

import java.util.List;

public class CustomerDaoImplement extends BaseDaoImplement <Customer ,Integer> implements CustomerDao {


    @Override
    public Address getCustomerAddress(int id) {
        String query="select c.address from Customer c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Address address = (Address) q.getSingleResult();

        return address;
    }

    @Override
    public Store getCustomerStore(int id) {
        String query="select c.store from Customer c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Store store = (Store) q.getSingleResult();

        return store;
    }

    @Override
    public List<Payment> getCustomerPayments(int id) {
        String query="from Payment p where p.customer.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        List<Payment> payments = (List<Payment>) q.getResultList();

        return payments;
    }

    @Override
    public List<Rental> getCustomerRentals(int id) {
        String query=" from Rental r where r.customer.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        List<Rental> rentals = (List<Rental>) q.getResultList();

        return rentals;
    }



    @Override
    public void add(Customer customer) {
        Address address = entityManager.find(Address.class , customer.getAddress().getId());
        customer.setAddress(address);

        Store store = entityManager.find(Store.class , customer.getStore().getId());
        customer.setStore(store);

        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
    }



}
