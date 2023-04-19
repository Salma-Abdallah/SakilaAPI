package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Staff;

import java.math.BigDecimal;

public interface PaymentDao {
    public BigDecimal getMaxPayment();
    public BigDecimal getMinPayment();
    public Staff getStaffByPayment(int id);
    public Customer getCustomerByPayment(int id);
}
