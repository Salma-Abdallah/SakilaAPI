package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.CategoryDao;
import gov.iti.jets.web.persistence.entity.Category;
import gov.iti.jets.web.persistence.entity.Film;
import jakarta.persistence.Query;

import java.util.List;

public class CategoryDaoImplement extends BaseDaoImplement<Category ,Integer>  implements CategoryDao {


    @Override
    public List<Category> searchCategoryByName(String name) {
        String query = "from Category a where a.name like ?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, "%" + name + "%");
        List<Category> categories = (List<Category>) q.getResultList();

        return null;
    }

    @Override
    public List<Film> getFilmsOfSpecificCategory(int id) {
        String query = "from Film f join FilmCategory fa where fa.id.categoryId = ?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);
        List<Film> films =(List<Film>) q.getResultList();

        return films;
    }

    @Override
    public long getNumOfFilmsOfSpecificCategory(int id) {
        String query = "select count(*) from Film f join FilmCategory fa where fa.id.categoryId = ?1";
        Query q = entityManager.createQuery(query)
                .setParameter(1, id);

        Long count =(Long) q.getSingleResult();

        return count;
    }
}
