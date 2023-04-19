package gov.iti.jets.web.persistence.daos.interfaces;

import gov.iti.jets.web.persistence.entity.Actor;

import java.util.List;

public interface ActorDao extends BaseDao<Actor, Integer>{

    public List<Actor> searchByName(String name);

}
