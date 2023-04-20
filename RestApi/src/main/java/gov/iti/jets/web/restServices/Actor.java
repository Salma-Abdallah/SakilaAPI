package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.services.ActorServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;


import java.util.ArrayList;
import java.util.List;

@Path("actor")
public class Actor {
    private ActorServices actorService;

    public Actor() {
        actorService = new ActorServices();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllActors(@Context UriInfo uriInfo) {
        List<ActorDto> actorDtos = actorService.getAllActors();

        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(actorDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActorById (@PathParam("id") int id , @Context UriInfo uriInfo) {
        ActorDto actorDto= actorService.getActorById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(actorDto).links(link).build();
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getActorByName(@PathParam("name") String name , @Context UriInfo uriInfo) {
        List<ActorDto> actorDtos = actorService.getActorByName(name);

        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(actorDtos).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addNewActor (ActorDto actorDto){
        actorService.addNewActor(actorDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateActor(ActorDto actorDto){
        actorService.updateActor(actorDto);
    }
}
