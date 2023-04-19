package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.mapper.CityMapper;
import gov.iti.jets.web.mapper.CountryMapper;
import gov.iti.jets.web.persistence.daos.implementation.*;
import gov.iti.jets.web.persistence.entity.City;
import gov.iti.jets.web.persistence.entity.Country;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class CountryService {
    private CountryDaoImplement countryDao;
    private CountryMapper mapper;

    public CountryService() {
        countryDao = new CountryDaoImplement();
        mapper = Mappers.getMapper(CountryMapper.class);
    }

    public List<CountryDto> getAllCountries(){
        List<Country> countries =countryDao.getAll();
        List<CountryDto> countryDtos= new ArrayList<>();

        for(Country country:countries) {
            countryDtos.add(mapper.toDto(country));
        }
        return countryDtos;
    }

    public CountryDto getCountryById(int id) {
        Country country = countryDao.getById(Country.class,id);
        return mapper.toDto(country);
    }

    public void addCountry(CountryDto countryDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        countryDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Country country = mapper.toEntity(countryDto);
        countryDao.add(country);
    }

    public void updateCountry(CountryDto countryDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        countryDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Country country = mapper.toEntity(countryDto);
        countryDao.update(country);
    }

    public CountryDto getCountryByName(String name) {
        Country country = countryDao.getCountryByName(name);
        return  mapper.toDto(country);
    }
}
