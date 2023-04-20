package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.services.StaffService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Staff {
    private StaffService staffService;

    public Staff() {
        staffService = new StaffService();
    }

    @WebResult(name="Staff")
    public List<StaffDto> getAllStaff() {
        return staffService.getAllStaff();
    }

    @WebResult(name="Staff")
    public StaffDto getStaffById(@WebParam(name="id") int id) {
        return staffService.getStaffById(id);
    }

    public void addStaff(@WebParam(name="staff") StaffDto staffDto) {
        staffService.addStaff(staffDto);
    }

    public void updateStaff(@WebParam(name="staff") StaffDto staffDto) {
        staffService.updateStaff(staffDto);
    }

    @WebResult(name="Staff")
    public List<StaffDto> getStaffByName(@WebParam(name="name") String name) {
        return staffService.getStaffByName(name);
    }

    @WebResult(name="Address")
    public AddressDto getStaffAddress(@WebParam(name="id") int id) {
        return staffService.getStaffAddress(id);
    }

    @WebResult(name="ActiveStaff")
    public long getNumberActiveStaff() {
        return staffService.getNumberActiveStaff();
    }

    @WebResult(name="InActiveStaff")
    public long getNumberInActiveStaff() {
        return staffService.getNumberInActiveStaff();
    }
}
