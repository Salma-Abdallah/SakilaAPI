package gov.iti.jets.web.persistence.daos.interfaces;

import java.util.List;

public interface BaseDao<T, ID> {
    public List<T> getAll();
    public T getById(Class<T> entityClass , ID id);
    public void update (T entityClass);
    public void add(T entityClass);
    public void delete (Class<T> entityClass , ID id);


}
