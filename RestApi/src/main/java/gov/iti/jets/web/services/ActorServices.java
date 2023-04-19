package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.mapper.ActorMapper;
import gov.iti.jets.web.persistence.daos.implementation.ActorDaoImplement;
import gov.iti.jets.web.persistence.entity.Actor;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.*;

public class ActorServices {
    private ActorDaoImplement actorDao;
    private ActorMapper actorMapper;

    public ActorServices() {
        actorDao = new ActorDaoImplement();
        actorMapper = Mappers.getMapper(ActorMapper.class);
    }

    public List<ActorDto> getAllActors() {
        List<Actor> actors = actorDao.getAll();
        List<ActorDto> actorDtos = new ArrayList<>();

        for(Actor actor: actors) {
            actorDtos.add(actorMapper.toDto(actor));
        }
        return actorDtos;
    }

    public ActorDto getActorById (int id) {
        Actor actor = actorDao.getById(Actor.class,id);

        return actorMapper.toDto(actor);
    }

    public void addNewActor (ActorDto actorDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        actorDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Actor actor = actorMapper.toEntity(actorDto);
        actorDao.add(actor);

    }

    public void updateActor(ActorDto actorDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        actorDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Actor actor = actorMapper.toEntity(actorDto);
        actorDao.update(actor);
    }

    public List<ActorDto> getActorByName(String name) {
        List<Actor> actors = actorDao.searchByName(name);
        List<ActorDto> actorDtos = new ArrayList<>();
        for (Actor actor : actors) {
            actorDtos.add(actorMapper.toDto(actor));
        }
        return actorDtos;
    }

}
