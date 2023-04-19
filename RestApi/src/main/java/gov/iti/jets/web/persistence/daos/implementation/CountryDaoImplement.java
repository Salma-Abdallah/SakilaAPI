package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.CountryDao;
import gov.iti.jets.web.persistence.entity.City;
import gov.iti.jets.web.persistence.entity.Country;
import jakarta.persistence.Query;

public class CountryDaoImplement extends BaseDaoImplement<Country,Integer> implements CountryDao {
    @Override
    public Country getCountryByName(String name) {
        String queryString = "from Country c where c.country like ?1 ";
        Query q = entityManager.createQuery(queryString)
                .setParameter(1,"%"+name+"%");
        Country country = (Country) q.getSingleResult();

        return country;
    }
}
