package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CityDto;
import gov.iti.jets.web.services.CityService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("city")
public class City {
    private CityService cityService;

    public City() {
        cityService = new CityService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCities(@Context UriInfo uriInfo) {
        List<CityDto> cityDtos = cityService.getAllCities();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(cityDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCityById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        CityDto cityDto = cityService.getCityById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(cityDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addCity(CityDto cityDto) {
        cityService.addCity(cityDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateCity(CityDto cityDto) {
        cityService.updateCity(cityDto);
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCityByName(@PathParam("name") String name ,@Context UriInfo uriInfo) {
        CityDto cityDto = cityService.getCityByName(name);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(cityDto).links(link).build();
    }
}
