package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.services.StaffService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Staff {
    private StaffService staffService;

    public Staff() {
        staffService = new StaffService();
    }

    public List<StaffDto> getAllStaff() {
        return staffService.getAllStaff();
    }

    public StaffDto getStaffById(int id) {
        return staffService.getStaffById(id);
    }

    public void addStaff(StaffDto staffDto) {
        staffService.addStaff(staffDto);
    }

    public void updateStaff(StaffDto staffDto) {
        staffService.updateStaff(staffDto);
    }

    public List<StaffDto> getStaffByName(String name) {
        return staffService.getStaffByName(name);
    }

    public AddressDto getStaffAddress(int id) {
        return staffService.getStaffAddress(id);
    }

    public long getNumberActiveStaff() {
        return staffService.getNumberActiveStaff();
    }

    public long getNumberInActiveStaff() {
        return staffService.getNumberInActiveStaff();
    }
}
