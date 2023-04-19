package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Staff;

import java.util.List;

public interface StaffDao {
    public List<Staff> getStaffByName(String name);
    public Address getStaffAddress(int id);
    public long getNumberActiveStaff();
    public long getNumberInActiveStaff();

}
