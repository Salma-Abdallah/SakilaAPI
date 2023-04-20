package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.services.CategoryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Category {
    private CategoryService categoryService;

    public Category() {
        categoryService = new CategoryService();
    }

    @WebResult(name="Categories")
    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @WebResult(name="Category")
    public CategoryDto getCategoryById(@WebParam(name = "id") int id) {
        return categoryService.getCategoryById(id);
    }


    public void addCategory(@WebParam(name="category") CategoryDto categoryDto) {
        categoryService.addCategory(categoryDto);
    }

    public void updateCategory(@WebParam(name="category") CategoryDto categoryDto) {
        categoryService.updateCategory(categoryDto);
    }

    @WebResult(name="Categories")
    public List<CategoryDto> searchCategoriesByName(@WebParam(name = "name") String name) {
        return categoryService.searchCategoriesByName(name);
    }

    @WebResult(name="Films")
    public List<FilmDto> getFilmsByCategoryId(@WebParam(name = "id") int id) {
        return categoryService.getFilmsByCategoryId(id);
    }

    @WebResult(name="NumberOfFilms")
    public long getNumOfFilmsOfSpecificCategory(@WebParam(name = "id") int id) {
        return categoryService.getNumOfFilmsOfSpecificCategory(id);
    }
}
