package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.CityDao;
import gov.iti.jets.web.persistence.entity.City;
import jakarta.persistence.Query;

public class CityDaoImplement extends BaseDaoImplement<City,Integer> implements CityDao {

    @Override
    public City getCityByName(String name) {
        String queryString = "from City c where c.city like ?1 ";
        Query q = entityManager.createQuery(queryString)
                .setParameter(1,"%"+name+"%");
        City city = (City) q.getSingleResult();

        return city;
    }
}
