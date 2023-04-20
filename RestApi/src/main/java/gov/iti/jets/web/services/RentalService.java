package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.RentalDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.mapper.CustomerMapper;
import gov.iti.jets.web.mapper.RentalMapper;
import gov.iti.jets.web.mapper.rental.RentalInventoryMapper;
import gov.iti.jets.web.mapper.rental.RentalStaffMapper;
import gov.iti.jets.web.persistence.daos.implementation.RentalDaoImplement;
import gov.iti.jets.web.persistence.entity.Rental;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.*;

public class RentalService {
    private RentalDaoImplement rentalDao;
    private RentalMapper mapper;
    public RentalService() {
        rentalDao = new RentalDaoImplement();
        mapper = Mappers.getMapper(RentalMapper.class);
    }

    public List<RentalDto> getAllRentals() {
        List<Rental> rentals = rentalDao.getAll();
        List<RentalDto> rentalDtos = new ArrayList<>();
        for (Rental s : rentals) {
            rentalDtos.add(mapper.toDto(s));
        }
        return rentalDtos;
    }

    public RentalDto getRentalById(int id) {
        Rental rental = rentalDao.getById(Rental.class,id);
        return mapper.toDto(rental);
    }
    public void addRental(RentalDto rentalDto){

        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        rentalDto.setLastUpdate(Instant.now());
        rentalDto.setRentalDate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Rental rental = mapper.toEntity(rentalDto);
        rentalDao.add(rental);
    }

    public void updateRental(RentalDto rentalDto){

        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        rentalDto.setLastUpdate(Instant.now());
        rentalDto.setRentalDate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Rental rental = mapper.toEntity(rentalDto);
        rentalDao.update(rental);
    }

    public RentalInventoryDto getInventoryByRental(int id) {
        RentalInventoryMapper rentalInventoryMapper = Mappers.getMapper(RentalInventoryMapper.class);
        return rentalInventoryMapper.toDto(rentalDao.getInventoryByRent(id));
    }

    public RentalStaffDto getStaffByRental (int id) {
        RentalStaffMapper rentalStaffMapper = Mappers.getMapper(RentalStaffMapper.class);
        return rentalStaffMapper.toDto(rentalDao.getStaffByRent(id));
    }

    public CustomerDto getCustomerByRental(int id) {
        CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
        return customerMapper.toDto(rentalDao.getCustomerByRent(id));
    }
}
