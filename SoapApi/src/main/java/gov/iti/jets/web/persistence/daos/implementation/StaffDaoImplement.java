package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.StaffDao;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Staff;
import jakarta.persistence.Query;

import java.util.List;

public class StaffDaoImplement extends BaseDaoImplement<Staff , Integer> implements StaffDao {


    @Override
    public List<Staff> getStaffByName(String name) {
        String query="from Staff a where a.firstName like ?1  or a.lastName like ?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, "%"+name+"%");

        List<Staff> staff = (List<Staff>) q.getResultList();

        return staff;
    }

    @Override
    public Address getStaffAddress(int id) {
        String query="select c.address from Staff c where c.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);

        Address address = (Address) q.getSingleResult();

        return address;
    }

    @Override
    public long getNumberActiveStaff() {
        String query ="select count(*) from Staff r  where r.active=true";
        Query q= entityManager.createQuery(query);
        Long count =(Long) q.getSingleResult();

        return count;
    }

    @Override
    public long getNumberInActiveStaff() {
        String query ="select count(*) from Staff r  where r.active=false";
        Query q= entityManager.createQuery(query);
        Long count =(Long) q.getSingleResult();

        return count;
    }
}
