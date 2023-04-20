package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.persistence.entity.Language;
import gov.iti.jets.web.services.FilmService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("film")
public class Film {
    private FilmService filmService;

    public Film() {
        filmService= new FilmService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllFilms(@Context UriInfo uriInfo) {
        List<FilmDto> filmDtos = filmService.getAllFilms();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(filmDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        FilmDto filmDto = filmService.getFilmById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(filmDto).links(link).build();
    }
    @POST
    @Consumes({"application/xml", "application/json"})
    public void add(FilmDto filmDto) {
        filmService.add(filmDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void update(FilmDto filmDto) {
        filmService.update(filmDto);
    }

    @GET
    @Path("actor/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmActorsById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        List<ActorDto> actorDtos = filmService.getFilmActorsById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(actorDtos).links(link).build();
    }

    @GET
    @Path("category/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmCategoryById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        List<CategoryDto> categoryDtos = filmService.getFilmCategoryById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(categoryDtos).links(link).build();
    }

    @GET
    @Path("store/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmStores(@PathParam("id") int id , @Context UriInfo uriInfo) {
        List<StoreDto> storeDtos = filmService.getFilmStores(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(storeDtos).links(link).build();
    }

    @GET
    @Path("language/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmLanguageById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        Language language = filmService.getFilmLanguagebyId(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(language).links(link).build();
    }

    @GET
    @Path("language/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNumberOfFilmsInInventory(@PathParam("id") int id , @Context UriInfo uriInfo) {
        Long count = filmService.getNumberOfFilmsInInventory(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(count).links(link).build();
    }
}

