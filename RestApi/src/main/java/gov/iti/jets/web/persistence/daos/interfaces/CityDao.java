package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.City;

public interface CityDao {
    public City getCityByName(String name);
}
