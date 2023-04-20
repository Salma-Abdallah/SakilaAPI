package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.services.AddressServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;


import java.util.List;

@Path("address")
public class Address {
    private AddressServices addressServices;

    public Address() {
        addressServices = new AddressServices();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAddresses(@Context UriInfo uriInfo) {
        List<AddressDto> addressDtos = addressServices.getAllAddresses();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(addressDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAddressById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        AddressDto addressDto = addressServices.getAddressById(id);

        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(addressDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addAddress(AddressUpdateDto addressDto) {
        addressServices.addAddress(addressDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateAddress(AddressUpdateDto addressDto) {
        addressServices.updateAddress(addressDto);
    }

    @GET
    @Path("store/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStoreByAddressId(@PathParam("id") int id ,@Context UriInfo uriInfo) {
        List<StoreDto> storeDtos = addressServices.getStoreByAddressId(id);

        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(storeDtos).links(link).build();
    }

    @GET
    @Path("staff/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStaffByAddressId(@PathParam("id") int id ,@Context UriInfo uriInfo) {
        List<StaffDto> staffDtos = addressServices.getStaffByAddressId(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(staffDtos).links(link).build();
    }

    @GET
    @Path("customer/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerByAddress(@PathParam("id") int id ,@Context UriInfo uriInfo) {
        List<CustomerDto> customerDtos = addressServices.getCustomerByAddress(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(customerDtos).links(link).build();
    }
}
