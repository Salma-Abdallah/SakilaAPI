package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.persistence.daos.interfaces.LanguageDao;
import gov.iti.jets.web.persistence.entity.Language;
import org.mapstruct.*;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
public interface LanguageMapper {
    LanguageDto toDto(Language language);
    Language toEntity(LanguageDto languageDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Language partialUpdate(LanguageDto languageDto, @MappingTarget Language language);
}
