package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.services.CategoryService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.util.List;

@Path("category")
public class Category {
    private CategoryService categoryService;

    public Category() {
        categoryService = new CategoryService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCategories(@Context UriInfo uriInfo) {
        List<CategoryDto> categoryDtos= categoryService.getAllCategories();
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(categoryDtos).links(link).build();
    }

    @GET
    @Path("{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategoryById(@PathParam("id") int id , @Context UriInfo uriInfo) {
        CategoryDto categoryDto = categoryService.getCategoryById(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(categoryDto).links(link).build();
    }

    @POST
    @Consumes({"application/xml", "application/json"})
    public void addCategory(CategoryDto categoryDto) {
        categoryService.addCategory(categoryDto);
    }

    @PUT
    @Consumes({"application/xml", "application/json"})
    public void updateCategory(CategoryDto categoryDto) {
        categoryService.updateCategory(categoryDto);
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response searchCategoriesByName(@PathParam("name") String name ,@Context UriInfo uriInfo) {
        List<CategoryDto> categoryDtos = categoryService.searchCategoriesByName(name);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(categoryDtos).links(link).build();
    }

    @GET
    @Path("film/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFilmsByCategoryId(@PathParam("id") int id ,@Context UriInfo uriInfo) {
        List<FilmDto> filmDtos = categoryService.getFilmsByCategoryId(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(filmDtos).links(link).build();
    }

    @GET
    @Path("filmNum/{id: [0-9]+}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNumOfFilmsOfSpecificCategory(@PathParam("id") int id ,@Context UriInfo uriInfo) {
        long count = categoryService.getNumOfFilmsOfSpecificCategory(id);
        Link link = Link.fromUriBuilder(uriInfo.getAbsolutePathBuilder()).rel("self").build();

        return Response.ok(count).links(link).build();
    }
}
