package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.PaymentDao;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Payment;
import gov.iti.jets.web.persistence.entity.Staff;
import jakarta.persistence.Query;

import java.math.BigDecimal;

public class PaymentDaoImplement extends BaseDaoImplement<Payment , Integer> implements PaymentDao {


    @Override
    public BigDecimal getMaxPayment() {
        String query="select max(p.amount) from Payment p";
        Query q=entityManager.createQuery(query);

        BigDecimal result = (BigDecimal) q.getSingleResult();

        return result;
    }

    @Override
    public BigDecimal getMinPayment() {
        String query="select min(p.amount) from Payment p";
        Query q=entityManager.createQuery(query);

        BigDecimal result = (BigDecimal) q.getSingleResult();

        return result;
    }

    @Override
    public Staff getStaffByPayment(int id) {
        String query="select p.staff from Payment p where p.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Staff staff = (Staff) q.getSingleResult();

        return staff;
    }

    @Override
    public Customer getCustomerByPayment(int id) {
        String query="select p.customer from Payment p where p.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Customer customer = (Customer) q.getSingleResult();

        return customer;
    }
}
