package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.connection.EntityManagerFactorySingleton;
import gov.iti.jets.web.persistence.daos.interfaces.ActorDao;
import gov.iti.jets.web.persistence.entity.Actor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class ActorDaoImplement extends BaseDaoImplement<Actor,Integer> implements ActorDao {
    EntityManager entityManager = EntityManagerFactorySingleton.getEntityManager();

    @Override
    public List<Actor> searchByName(String name) {
        String query="from Actor a where a.firstName like ?1 or a.lastName like ?2";
        Query q = entityManager.createQuery(query)
                .setParameter(1,"%"+name+"%")
                .setParameter(2,"%"+name+"%");
        List<Actor> actors =(List<Actor>) q.getResultList();

        return actors;
    }


}
