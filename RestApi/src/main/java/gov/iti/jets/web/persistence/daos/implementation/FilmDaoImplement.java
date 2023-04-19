package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.FilmDao;
import gov.iti.jets.web.persistence.entity.*;
import jakarta.persistence.Query;

import java.util.List;

public class FilmDaoImplement extends BaseDaoImplement<Film , Integer>  implements FilmDao {


    @Override
    public List<Actor> getFilmActors(int id) {
        String query = " from Actor a where a.film.id=?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);
        List<Actor> actors = (List<Actor>) q.getResultList();

        return actors;
    }

    @Override
    public List<Category> getFilmCategory(int id) {
        String query = " from Actor a where a.category.id=?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);
        List<Category> categories = (List<Category>) q.getResultList();

        return categories;
    }

    @Override
    public List<Store> getFilmStores(int id) {
        String query = "select s from Store s  join Inventory i  where i.film.id=?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);
        List<Store> stores = (List<Store>) q.getResultList();

        return stores;
    }

    @Override
    public Language getFilmLanguage(int id) {
        String query = " from Actor a where a.language.id=?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);
        Language language =(Language) q.getSingleResult();

        return language;
    }

    @Override
    public Long getNumberOfFilmsInInventory(int id) {
        String query = "select count(*) from Inventory i where i.film.id=?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);

        Long count = (Long) q.getSingleResult();

        return count;
    }
}
