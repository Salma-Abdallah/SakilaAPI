package gov.iti.jets.web.restServices;


import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.StoreUpdateDto;
import gov.iti.jets.web.services.StoreService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("store")
public class Store {
    private StoreService storeService;

    public Store() {
        storeService = new StoreService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStores(@Context UriInfo uriInfo) {
        List<StoreDto> storeDtos = storeService.getAllStores();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(storeDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStoreById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        StoreDto storeDto = storeService.getStoreById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(storeDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addStore(StoreUpdateDto storeDto) {
        storeService.addStore(storeDto);
    }
}
