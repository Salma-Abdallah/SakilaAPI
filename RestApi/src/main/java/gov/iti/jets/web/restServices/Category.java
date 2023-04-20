package gov.iti.jets.web.restServices;

import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.services.CategoryService;

import java.util.List;


public class Category {
    private CategoryService categoryService;

    public Category() {
        categoryService = new CategoryService();
    }

    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }

    public CategoryDto getCategoryById(int id) {
        return categoryService.getCategoryById(id);
    }

    public void addCategory(CategoryDto categoryDto) {
        categoryService.addCategory(categoryDto);
    }

    public void updateCategory(CategoryDto categoryDto) {
        categoryService.updateCategory(categoryDto);
    }

    public List<CategoryDto> searchCategoriesByName(String name) {
        return categoryService.searchCategoriesByName(name);
    }

    public List<FilmDto> getFilmsByCategoryId(int id) {
        return categoryService.getFilmsByCategoryId(id);
    }

    public long getNumOfFilmsOfSpecificCategory(int id) {
        return categoryService.getNumOfFilmsOfSpecificCategory(id);
    }
}
