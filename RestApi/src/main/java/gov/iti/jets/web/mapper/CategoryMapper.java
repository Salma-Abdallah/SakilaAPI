package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.persistence.entity.Category;
import org.mapstruct.*;

@Mapper
public interface CategoryMapper {
    Category toEntity(CategoryDto categoryDto);

    CategoryDto toDto(Category category);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Category partialUpdate(CategoryDto categoryDto, @MappingTarget Category category);
}
