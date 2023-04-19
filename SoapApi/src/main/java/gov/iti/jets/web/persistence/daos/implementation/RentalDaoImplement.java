package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.RentalDao;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Inventory;
import gov.iti.jets.web.persistence.entity.Rental;
import gov.iti.jets.web.persistence.entity.Staff;
import jakarta.persistence.Query;

public class RentalDaoImplement extends BaseDaoImplement<Rental , Integer> implements RentalDao {


    @Override
    public Inventory getInventoryByRent(int id) {
        String query="select c.inventory from Rental c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Inventory inventory = (Inventory) q.getSingleResult();

        return inventory;
    }

    @Override
    public Staff getStaffByRent(int id) {
        String query="select c.staff from Rental c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Staff staff = (Staff) q.getSingleResult();


        return staff;
    }

    @Override
    public Customer getCustomerByRent(int id) {
        String query="select c.customer from Rental c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Customer customer = (Customer) q.getSingleResult();

        return customer;
    }
}
