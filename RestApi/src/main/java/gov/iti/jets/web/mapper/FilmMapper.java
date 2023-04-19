package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.persistence.entity.Film;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FilmMapper {
    @Mapping(source = "originalLanguageId", target = "originalLanguage.id")
    @Mapping(source = "languageId", target = "language.id")
    Film toEntity(FilmDto filmDto);

    @InheritInverseConfiguration(name = "toEntity")
    FilmDto toDto(Film film);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Film partialUpdate(FilmDto filmDto, @MappingTarget Film film);
}
