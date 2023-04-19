package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.CityDto;
import gov.iti.jets.web.mapper.CityMapper;
import gov.iti.jets.web.persistence.daos.implementation.CityDaoImplement;
import gov.iti.jets.web.persistence.entity.City;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class CityService {
    private CityDaoImplement cityDao;
    private CityMapper mapper;

    public CityService() {
        cityDao = new CityDaoImplement();
        mapper = Mappers.getMapper(CityMapper.class);
    }

    public List<CityDto> getAllCities() {
        List<City> cities = cityDao.getAll();
        List<CityDto> cityDtos = new ArrayList<>();

        for(City city:cities) {
            cityDtos.add(mapper.toDto(city));
        }
        return  cityDtos;
    }

    public CityDto getCityById(int id) {
        City city = cityDao.getById(City.class,id);
        return mapper.toDto(city);
    }

    public void addCity(CityDto cityDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        cityDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        City city = mapper.toEntity(cityDto);
        cityDao.add(city);

    }

    public void updateCity(CityDto cityDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        cityDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        City city = mapper.toEntity(cityDto);
        cityDao.update(city);

    }

    public CityDto getCityByName(String name) {
        City city=cityDao.getCityByName(name);

        return mapper.toDto(city);
    }
}
