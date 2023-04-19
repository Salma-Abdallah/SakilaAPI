package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Country;

public interface CountryDao {
    public Country getCountryByName(String name);
}
