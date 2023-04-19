package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Category;
import gov.iti.jets.web.persistence.entity.Film;

import java.util.List;

public interface CategoryDao {
    public List<Category> searchCategoryByName(String name);
    public List<Film> getFilmsOfSpecificCategory(int id);
    public long getNumOfFilmsOfSpecificCategory(int id);
}
