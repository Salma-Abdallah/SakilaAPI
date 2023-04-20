package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.persistence.entity.Language;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:42:01+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public LanguageDto toDto(Language language) {
        if ( language == null ) {
            return null;
        }

        LanguageDto languageDto = new LanguageDto();

        return languageDto;
    }

    @Override
    public Language toEntity(LanguageDto languageDto) {
        if ( languageDto == null ) {
            return null;
        }

        Language language = new Language();

        return language;
    }

    @Override
    public Language partialUpdate(LanguageDto languageDto, Language language) {
        if ( languageDto == null ) {
            return language;
        }

        return language;
    }
}
