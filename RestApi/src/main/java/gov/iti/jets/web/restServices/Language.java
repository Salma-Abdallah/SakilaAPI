package gov.iti.jets.web.restServices;


import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.services.LanguageService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("language")
public class Language {
    private LanguageService languageService;

    public Language() {
        languageService = new LanguageService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllLanguages(@Context UriInfo uriInfo) {
        List<LanguageDto> languageDtos = languageService.getAllLanguages();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(languageDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLanguageById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        LanguageDto languageDto = languageService.getLanguageById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(languageDto).links(link).build();
    }

    @GET
    @Path("film/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmLanguageById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        LanguageDto languageDto = languageService.getFilmLanguageById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(languageDto).links(link).build();
    }
}
