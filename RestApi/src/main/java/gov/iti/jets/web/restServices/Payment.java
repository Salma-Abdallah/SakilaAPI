package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.PaymentDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.services.PaymentService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@Path("payment")
public class Payment {
    private PaymentService paymentService;

    public Payment() {
        paymentService = new PaymentService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPayments(@Context UriInfo uriInfo) {
        List<PaymentDto> paymentDtos = paymentService.getAllPayments();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(paymentDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPaymentById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        PaymentDto paymentDto = paymentService.getPaymentById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(paymentDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addPayment(PaymentDto paymentDto) {
        paymentService.addPayment(paymentDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updatePayment(PaymentDto paymentDto) {
        paymentService.updatePayment(paymentDto);
    }

    @GET
    @Path("max")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMaxPayment(@Context UriInfo uriInfo) {
        BigDecimal max = paymentService.getMaxPayment();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(max).links(link).build();
    }

    @GET
    @Path("min")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMinPayment(@Context UriInfo uriInfo) {
        BigDecimal min = paymentService.getMinPayment();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(min).links(link).build();
    }

    @GET
    @Path("staff/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStaffByPayment(@PathParam("id") int id , @Context UriInfo uriInfo) {
        StaffDto staffDto = paymentService.getStaffByPayment(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(staffDto).links(link).build();
    }

    @GET
    @Path("customer/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerByPayment(@PathParam("id") int id , @Context UriInfo uriInfo) {
        CustomerDto customerDto = paymentService.getCustomerByPayment(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(customerDto).links(link).build();
    }
}
