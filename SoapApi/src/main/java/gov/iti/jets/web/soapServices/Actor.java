package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.services.ActorServices;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Actor {
    private ActorServices actorService;

    public Actor() {
        actorService = new ActorServices();
    }

    @WebResult(name = "Actors")
    public List<ActorDto> getAllActors() {
        return actorService.getAllActors();
    }

    @WebResult(name = "Actor")
    public ActorDto getActorById (int id) {
        return actorService.getActorById(id);
    }

    @WebResult(name = "Actors")
    public List<ActorDto> getActorByName(String name) {
        return actorService.getActorByName(name);
    }

    public void addNewActor (@WebParam(name = "actor")ActorDto actorDto){
        actorService.addNewActor(actorDto);
    }

    public void updateActor(@WebParam(name = "actor")ActorDto actorDto){
        actorService.updateActor(actorDto);
    }
}
