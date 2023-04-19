package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.InventoryDao;
import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.persistence.entity.Inventory;
import gov.iti.jets.web.persistence.entity.Store;
import jakarta.persistence.Query;

public class InventoryDaoImplement extends BaseDaoImplement<Inventory , Integer>  implements InventoryDao {


    @Override
    public Film getFilmByInventoryId(int id) {
        String query="select i.film from Inventory i where i.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);

        Film film =(Film) q.getSingleResult();

        return film;
    }

    @Override
    public Store getStoreByInventoryId(int id) {
        String query="select i.store from Inventory i where i.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);

        Store store =(Store) q.getSingleResult();
        return store;
    }
}
