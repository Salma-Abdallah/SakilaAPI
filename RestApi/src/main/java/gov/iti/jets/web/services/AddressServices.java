package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.mapper.*;
import gov.iti.jets.web.persistence.daos.implementation.AddressDaoImplement;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Staff;
import gov.iti.jets.web.persistence.entity.Store;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddressServices {
    private AddressMapper mapper;
    private AddressDaoImplement addressDao;

    public AddressServices() {
        addressDao = new AddressDaoImplement();
        mapper = Mappers.getMapper(AddressMapper.class);
    }

    public List<AddressDto> getAllAddresses() {
        List<Address> addresses = addressDao.getAll();
        List<AddressDto> addressDtos = new ArrayList<>();
        for (Address address : addresses) {
            addressDtos.add(mapper.toDto(address));
        }
        return addressDtos;
    }

    public AddressDto getAddressById(int id) {
        Address address = addressDao.getById(Address.class ,id);
        return mapper.toDto(address);
    }

    public void addAddress(AddressUpdateDto addressDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        addressDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        AddressUpdateMapper addressMapper = Mappers.getMapper(AddressUpdateMapper.class);
        Address address = addressMapper.toEntity(addressDto);
        addressDao.add(address);
    }

    public void updateAddress(AddressUpdateDto addressDto) {
        AddressUpdateMapper addressMapper = Mappers.getMapper(AddressUpdateMapper.class);
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        addressDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Address address = addressMapper.toEntity(addressDto);
        addressDao.update(address);
    }
    public List<StoreDto> getStoreByAddressId(int id) {
        StoreMapper storeMapper = Mappers.getMapper(StoreMapper.class);
        List<Store> stores = addressDao.getStoreByAddressId(id);
        List<StoreDto> storeDtos = new ArrayList<>();
        for (Store store : stores) {
            storeDtos.add(storeMapper.toDto(store));
        }
        return storeDtos;
    }
    public List<StaffDto> getStaffByAddressId(int id) {
        StaffMapper staffMapper = Mappers.getMapper(StaffMapper.class);
        List<Staff> staffList = addressDao.getStaffByAddressId(id);
        List<StaffDto> staffdtos = new ArrayList<>();
        for (Staff staff : staffList) {
            staffdtos.add(staffMapper.toDto(staff));
        }
        return staffdtos;
    }

    public List<CustomerDto> getCustomerByAddress(int id) {
        CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
        List<Customer> customers = addressDao.getCustomerByAddressId(id);
        List<CustomerDto> customerDtos = new ArrayList<>();
        for (Customer r : customers
        ) {
            customerDtos.add(customerMapper.toDto(r));
        }
        return customerDtos;
    }

}
