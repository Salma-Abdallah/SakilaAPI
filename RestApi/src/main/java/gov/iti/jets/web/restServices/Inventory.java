package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.InventoryDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.services.InventoryService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("inventory")
public class Inventory {
    private InventoryService inventoryService;

    public Inventory() {
        inventoryService = new InventoryService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllInventories(@Context UriInfo uriInfo) {
        List<InventoryDto> inventoryDtos = inventoryService.getAllInventories();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(inventoryDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInventoryById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        RentalInventoryDto rentalInventoryDto = inventoryService.getInventoryById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(rentalInventoryDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addPayment(InventoryDto inventoryDto) {
        inventoryService.addPayment(inventoryDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updatePayment(InventoryDto inventoryDto) {
        inventoryService.updatePayment(inventoryDto);
    }

    @GET
    @Path("film/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmByInventoryId(@PathParam("id") int id , @Context UriInfo uriInfo) {
        FilmDto filmDto = inventoryService.getFilmByInventoryId(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(filmDto).links(link).build();
    }

    @GET
    @Path("film/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStoreByInventoryId(@PathParam("id") int id , @Context UriInfo uriInfo) {
        StoreDto storeDto = inventoryService.getStoreByInventoryId(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(storeDto).links(link).build();

    }
}
