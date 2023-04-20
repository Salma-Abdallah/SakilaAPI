package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.services.CountryService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;


import java.util.List;

@Path("country")
public class Country {
    private CountryService countryService;

    public Country() {
        countryService = new CountryService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCountries(@Context UriInfo uriInfo) {
        List<CountryDto> countryDtos = countryService.getAllCountries();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(countryDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCountryById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        CountryDto countryDto = countryService.getCountryById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(countryDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addCountry(CountryDto countryDto) {
        countryService.addCountry(countryDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateCountry(CountryDto countryDto) {
        countryService.updateCountry(countryDto);
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCountryByName(@PathParam("name") String name ,@Context UriInfo uriInfo) {
        CountryDto countryDto = countryService.getCountryByName(name);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(countryDto).links(link).build();
    }
}
