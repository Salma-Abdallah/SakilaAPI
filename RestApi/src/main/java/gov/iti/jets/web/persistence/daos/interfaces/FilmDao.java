package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Actor;
import gov.iti.jets.web.persistence.entity.Category;
import gov.iti.jets.web.persistence.entity.Language;
import gov.iti.jets.web.persistence.entity.Store;

import java.util.List;

public interface FilmDao {
    public List<Actor> getFilmActors(int id);
    public List<Category> getFilmCategory(int id);
    public List<Store> getFilmStores(int id);
    public Language getFilmLanguage(int id);
    public Long getNumberOfFilmsInInventory(int id);
}
