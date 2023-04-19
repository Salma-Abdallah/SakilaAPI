package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.mapper.AddressMapper;
import gov.iti.jets.web.mapper.StaffMapper;
import gov.iti.jets.web.persistence.daos.implementation.StaffDaoImplement;
import gov.iti.jets.web.persistence.entity.Staff;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.*;

public class StaffService {
    private StaffDaoImplement staffDao;
    private StaffMapper mapper;

    public StaffService() {
        staffDao = new StaffDaoImplement();
        mapper = Mappers.getMapper(StaffMapper.class);
    }

    public List<StaffDto> getAllStaff() {
        List<Staff> staff = staffDao.getAll();
        List<StaffDto> staffDtos = new ArrayList<>();
        for (Staff s : staff) {
            staffDtos.add(mapper.toDto(s));
        }
        return staffDtos;
    }

    public StaffDto getStaffById(int id) {
        Staff staff = staffDao.getById(Staff.class, id);
        return mapper.toDto(staff);
    }

    public void addStaff(StaffDto staffDto){
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        staffDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Staff staff = mapper.toEntity(staffDto);
        staffDao.add(staff);
    }

    public void updateStaff(StaffDto staffDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        staffDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Staff staff = mapper.toEntity(staffDto);
        staffDao.update(staff);
    }

    public List<StaffDto> getStaffByName(String name) {

        List<StaffDto> staffDtos = new ArrayList<>();
        List<Staff> staffs = staffDao.getStaffByName(name);
        for (Staff s : staffs
        ) {
            staffDtos.add(mapper.toDto(s));
        }
        return staffDtos;

    }

    public AddressDto getStaffAddress(int id) {
        AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);

        return addressMapper.toDto(staffDao.getStaffAddress(id));

    }

    public long getNumberActiveStaff() {

        return staffDao.getNumberActiveStaff();
    }

    public long getNumberInActiveStaff() {
        return staffDao.getNumberInActiveStaff();
    }
}
