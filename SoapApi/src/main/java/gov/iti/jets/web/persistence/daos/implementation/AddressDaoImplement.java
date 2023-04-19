package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.connection.EntityManagerFactorySingleton;
import gov.iti.jets.web.persistence.daos.interfaces.AddressDao;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Staff;
import gov.iti.jets.web.persistence.entity.Store;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AddressDaoImplement extends BaseDaoImplement<Address, Integer> implements AddressDao {

    EntityManager entityManager = EntityManagerFactorySingleton.getEntityManager();

    @Override
    public List<Store> getStoreByAddressId(int id) {
        String query = "from Store s where s.address.id = ?1";
        List<Store> stores = (List<Store>) entityManager.createQuery(query)
                .setParameter(1,id)
                .getResultList();

        return stores;
    }

    @Override
    public List<Customer> getCustomerByAddressId(int id) {
        String query ="from Customer c where c.address.id = ?1";
        List<Customer> customers = (List<Customer>) entityManager.createQuery(query)
                .setParameter(1 , id)
                .getResultList();

        return null;
    }

    @Override
    public List<Staff> getStaffByAddressId(int id) {
        String query = "from Staff s where s.address.id = ?1";
        List<Staff> staffList = (List<Staff>) entityManager.createQuery(query)
                .setParameter(1,id)
                .getResultList();

        return null;
    }
}
