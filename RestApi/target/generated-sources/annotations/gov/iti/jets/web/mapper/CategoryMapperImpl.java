package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.persistence.entity.Category;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T15:34:29+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toEntity(CategoryDto categoryDto) {
        if ( categoryDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryDto.getId() );
        category.setName( categoryDto.getName() );
        category.setLastUpdate( categoryDto.getLastUpdate() );

        return category;
    }

    @Override
    public CategoryDto toDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( category.getId() );
        categoryDto.setName( category.getName() );
        categoryDto.setLastUpdate( category.getLastUpdate() );

        return categoryDto;
    }

    @Override
    public Category partialUpdate(CategoryDto categoryDto, Category category) {
        if ( categoryDto == null ) {
            return category;
        }

        if ( categoryDto.getId() != null ) {
            category.setId( categoryDto.getId() );
        }
        if ( categoryDto.getName() != null ) {
            category.setName( categoryDto.getName() );
        }
        if ( categoryDto.getLastUpdate() != null ) {
            category.setLastUpdate( categoryDto.getLastUpdate() );
        }

        return category;
    }
}
