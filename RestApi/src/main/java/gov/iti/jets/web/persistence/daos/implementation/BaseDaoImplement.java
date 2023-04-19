package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.connection.EntityManagerFactorySingleton;
import gov.iti.jets.web.persistence.daos.interfaces.BaseDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.lang.reflect.*;
import java.util.List;

public abstract class BaseDaoImplement<T, ID> implements BaseDao<T,ID> {
    EntityManager entityManager = EntityManagerFactorySingleton.getEntityManager();

    @Override
    public List<T> getAll(){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(getEntityClass());
        Root<T> root =query.from(getEntityClass());
        query.select(root);

        return entityManager.createQuery(query).getResultList();
    }
    @Override
    public T getById(Class<T> entityClass , ID id) {
        T entity = entityManager.find(entityClass , id);

        return entity;
    }

    @Override
    public void update (T entityClass) {
        entityManager.getTransaction().begin();
        entityManager.merge(entityClass);
        entityManager.getTransaction().commit();
    }

    @Override
    public void add(T entityClass) {
        entityManager.getTransaction().begin();
        entityManager.persist(entityClass);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete (Class<T> entityClass , ID id) {
        T entity = entityManager.find(entityClass , id);
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    private Class<T> getEntityClass() {
        Type type = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;

        return (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }
}
