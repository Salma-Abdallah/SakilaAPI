package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.mapper.CategoryMapper;
import gov.iti.jets.web.mapper.FilmMapper;
import gov.iti.jets.web.persistence.daos.implementation.CategoryDaoImplement;
import gov.iti.jets.web.persistence.entity.Category;
import gov.iti.jets.web.persistence.entity.Film;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryService {
    private CategoryDaoImplement categoryDao;
    private CategoryMapper mapper;

    public CategoryService() {
        categoryDao = new CategoryDaoImplement();
        mapper = Mappers.getMapper(CategoryMapper.class);
    }

    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryDao.getAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        for (Category category : categories) {
            categoryDtos.add(mapper.toDto(category));
        }
        return categoryDtos;
    }
    public CategoryDto getCategoryById(int id) {
        Category category = categoryDao.getById(Category.class , id);
        return mapper.toDto(category);
    }

    public void addCategory(CategoryDto categoryDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        categoryDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Category category = mapper.toEntity(categoryDto);
        categoryDao.add(category);
    }

    public void updateCategory(CategoryDto categoryDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        categoryDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Category category = mapper.toEntity(categoryDto);
        categoryDao.update(category);
    }

    public List<CategoryDto> searchCategoriesByName(String name) {
        List<Category> categories = categoryDao.searchCategoryByName(name);
        List<CategoryDto> categoryDtos = new ArrayList<>();
        for (Category category : categories) {
            categoryDtos.add(mapper.toDto(category));
        }
        return categoryDtos;
    }

    public List<FilmDto> getFilmsByCategoryId(int id) {
        FilmMapper filmMapper = Mappers.getMapper(FilmMapper.class);
        List<Film> films = categoryDao.getFilmsOfSpecificCategory(id);
        List<FilmDto> filmDtos = new ArrayList<>();

        for (Film film : films) {
            filmDtos.add(filmMapper.toDto(film));
        }
        return filmDtos;

    }

    public long getNumOfFilmsOfSpecificCategory(int id) {
        return categoryDao.getNumOfFilmsOfSpecificCategory(id);
    }
}
