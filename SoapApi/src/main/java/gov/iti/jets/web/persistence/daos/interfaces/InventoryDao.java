package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.persistence.entity.Store;


public interface InventoryDao {
    public Film getFilmByInventoryId(int id) ;
    public Store getStoreByInventoryId(int id);
}
