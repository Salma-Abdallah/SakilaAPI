package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.services.StaffService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("staff")
public class Staff {
    private StaffService staffService;

    public Staff() {
        staffService = new StaffService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStaff(@Context UriInfo uriInfo) {
        List<StaffDto> staffDtos = staffService.getAllStaff();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(staffDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStaffById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        StaffDto staffDto = staffService.getStaffById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(staffDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addStaff(StaffDto staffDto) {
        staffService.addStaff(staffDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateStaff(StaffDto staffDto) {
        staffService.updateStaff(staffDto);
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStaffByName(@PathParam("name") String name , @Context UriInfo uriInfo) {
        List<StaffDto> staffDtos = staffService.getStaffByName(name);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(staffDtos).links(link).build();
    }

    @GET
    @Path("address/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStaffAddress(@PathParam("id") int id , @Context UriInfo uriInfo) {
        AddressDto addressDto = staffService.getStaffAddress(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(addressDto).links(link).build();
    }

    @GET
    @Path("active")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNumberActiveStaff( @Context UriInfo uriInfo) {
        long count = staffService.getNumberActiveStaff();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(count).links(link).build();
    }

    @GET
    @Path("inActive")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNumberInActiveStaff( @Context UriInfo uriInfo) {
        long count = staffService.getNumberInActiveStaff();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(count).links(link).build();
    }
}
