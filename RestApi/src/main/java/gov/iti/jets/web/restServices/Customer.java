package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.*;
import gov.iti.jets.web.services.CustomerServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("customer")
public class Customer {
    private CustomerServices customerServices;

    public Customer() {
        customerServices = new CustomerServices();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCustomer(@Context UriInfo uriInfo) {
        List<CustomerDto> customerDtos = customerServices.getAllCustomer();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(customerDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerById(@PathParam("id") int id , @Context UriInfo uriInfo){
        CustomerDto customerDto = customerServices.getCustomerById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(customerDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addCustomer(CustomerUpdateDto customerDto) {
        customerServices.addCustomer(customerDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateCustomer(CustomerUpdateDto customerDto) {
        customerServices.updateCustomer(customerDto);
    }

    @GET
    @Path("address/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerAddress(@PathParam("id") int id , @Context UriInfo uriInfo) {
        AddressDto addressDto = customerServices.getCustomerAddress(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(addressDto).links(link).build();
    }

    @GET
    @Path("store/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerStore(@PathParam("id") int id , @Context UriInfo uriInfo) {
        StoreDto storeDto = customerServices.getCustomerStore(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(storeDto).links(link).build();
    }

    @GET
    @Path("payment/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerPayments(@PathParam("id") int id , @Context UriInfo uriInfo) {
        List<PaymentDto> paymentDtos = customerServices.getCustomerPayments(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(paymentDtos).links(link).build();
    }

    @GET
    @Path("rent/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerRents(@PathParam("id") int id , @Context UriInfo uriInfo) {
        List<RentalDto> rentalDtos = customerServices.getCustomerRents(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(rentalDtos).links(link).build();
    }
}
