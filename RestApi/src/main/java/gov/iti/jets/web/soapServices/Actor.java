package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.services.ActorServices;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Actor {
    private ActorServices actorService;

    public Actor() {
        actorService = new ActorServices();
    }

    public List<ActorDto> getAllActors() {
        return actorService.getAllActors();
    }

    public ActorDto getActorById (int id) {
        return actorService.getActorById(id);
    }

    public List<ActorDto> getActorByName(String name) {
        return actorService.getActorByName(name);
    }

    public void addNewActor (ActorDto actorDto){
        actorService.addNewActor(actorDto);
    }

    public void updateActor(ActorDto actorDto){
        actorService.updateActor(actorDto);
    }
}
