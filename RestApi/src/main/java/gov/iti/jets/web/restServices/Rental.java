package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.RentalDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.services.RentalService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("rental")
public class Rental {
    private RentalService rentalService;

    public Rental() {
        rentalService = new RentalService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllRentals(@Context UriInfo uriInfo) {
        List<RentalDto> rentalDtos = rentalService.getAllRentals();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(rentalDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRentalById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        RentalDto rentalDto = rentalService.getRentalById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(rentalDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addRental(RentalDto rentalDto) {
        rentalService.addRental(rentalDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateRental(RentalDto rentalDto) {
        rentalService.updateRental(rentalDto);
    }

    @GET
    @Path("inventory/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInventoryByRental(@PathParam("id") int id , @Context UriInfo uriInfo) {
        RentalInventoryDto rentalInventoryDto = rentalService.getInventoryByRental(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(rentalInventoryDto).links(link).build();
    }

    @GET
    @Path("staff/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStaffByRental (@PathParam("id") int id , @Context UriInfo uriInfo) {
        RentalStaffDto rentalStaffDto = rentalService.getStaffByRental(id) ;
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(rentalStaffDto).links(link).build();
    }

    @GET
    @Path("customer/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerByRental(@PathParam("id") int id , @Context UriInfo uriInfo) {
        CustomerDto customerDto = rentalService.getCustomerByRental(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(customerDto).links(link).build();
    }
}
