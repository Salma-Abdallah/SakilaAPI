package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.persistence.entity.Language;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:26:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class FilmMapperImpl implements FilmMapper {

    @Override
    public Film toEntity(FilmDto filmDto) {
        if ( filmDto == null ) {
            return null;
        }

        Film film = new Film();

        film.setOriginalLanguage( filmDtoToLanguage( filmDto ) );
        film.setLanguage( filmDtoToLanguage1( filmDto ) );
        film.setDescription( filmDto.getDescription() );
        film.setId( filmDto.getId() );
        film.setLastUpdate( filmDto.getLastUpdate() );
        film.setLength( filmDto.getLength() );
        film.setRating( filmDto.getRating() );
        film.setReleaseYear( filmDto.getReleaseYear() );
        film.setRentalDuration( filmDto.getRentalDuration() );
        film.setRentalRate( filmDto.getRentalRate() );
        film.setReplacementCost( filmDto.getReplacementCost() );
        film.setSpecialFeatures( filmDto.getSpecialFeatures() );
        film.setTitle( filmDto.getTitle() );

        return film;
    }

    @Override
    public FilmDto toDto(Film film) {
        if ( film == null ) {
            return null;
        }

        FilmDto filmDto = new FilmDto();

        filmDto.setOriginalLanguageId( filmOriginalLanguageId( film ) );
        filmDto.setLanguageId( filmLanguageId( film ) );
        filmDto.setDescription( film.getDescription() );
        filmDto.setId( film.getId() );
        filmDto.setLastUpdate( film.getLastUpdate() );
        filmDto.setLength( film.getLength() );
        filmDto.setRating( film.getRating() );
        filmDto.setReleaseYear( film.getReleaseYear() );
        filmDto.setRentalDuration( film.getRentalDuration() );
        filmDto.setRentalRate( film.getRentalRate() );
        filmDto.setReplacementCost( film.getReplacementCost() );
        filmDto.setSpecialFeatures( film.getSpecialFeatures() );
        filmDto.setTitle( film.getTitle() );

        return filmDto;
    }

    @Override
    public Film partialUpdate(FilmDto filmDto, Film film) {
        if ( filmDto == null ) {
            return film;
        }

        if ( film.getOriginalLanguage() == null ) {
            film.setOriginalLanguage( new Language() );
        }
        filmDtoToLanguage2( filmDto, film.getOriginalLanguage() );
        if ( film.getLanguage() == null ) {
            film.setLanguage( new Language() );
        }
        filmDtoToLanguage3( filmDto, film.getLanguage() );
        if ( filmDto.getDescription() != null ) {
            film.setDescription( filmDto.getDescription() );
        }
        if ( filmDto.getId() != null ) {
            film.setId( filmDto.getId() );
        }
        if ( filmDto.getLastUpdate() != null ) {
            film.setLastUpdate( filmDto.getLastUpdate() );
        }
        if ( filmDto.getLength() != null ) {
            film.setLength( filmDto.getLength() );
        }
        if ( filmDto.getRating() != null ) {
            film.setRating( filmDto.getRating() );
        }
        if ( filmDto.getReleaseYear() != null ) {
            film.setReleaseYear( filmDto.getReleaseYear() );
        }
        if ( filmDto.getRentalDuration() != null ) {
            film.setRentalDuration( filmDto.getRentalDuration() );
        }
        if ( filmDto.getRentalRate() != null ) {
            film.setRentalRate( filmDto.getRentalRate() );
        }
        if ( filmDto.getReplacementCost() != null ) {
            film.setReplacementCost( filmDto.getReplacementCost() );
        }
        if ( filmDto.getSpecialFeatures() != null ) {
            film.setSpecialFeatures( filmDto.getSpecialFeatures() );
        }
        if ( filmDto.getTitle() != null ) {
            film.setTitle( filmDto.getTitle() );
        }

        return film;
    }

    protected Language filmDtoToLanguage(FilmDto filmDto) {
        if ( filmDto == null ) {
            return null;
        }

        Language language = new Language();

        language.setId( filmDto.getOriginalLanguageId() );

        return language;
    }

    protected Language filmDtoToLanguage1(FilmDto filmDto) {
        if ( filmDto == null ) {
            return null;
        }

        Language language = new Language();

        language.setId( filmDto.getLanguageId() );

        return language;
    }

    private Short filmOriginalLanguageId(Film film) {
        if ( film == null ) {
            return null;
        }
        Language originalLanguage = film.getOriginalLanguage();
        if ( originalLanguage == null ) {
            return null;
        }
        Short id = originalLanguage.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Short filmLanguageId(Film film) {
        if ( film == null ) {
            return null;
        }
        Language language = film.getLanguage();
        if ( language == null ) {
            return null;
        }
        Short id = language.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void filmDtoToLanguage2(FilmDto filmDto, Language mappingTarget) {
        if ( filmDto == null ) {
            return;
        }

        if ( filmDto.getOriginalLanguageId() != null ) {
            mappingTarget.setId( filmDto.getOriginalLanguageId() );
        }
    }

    protected void filmDtoToLanguage3(FilmDto filmDto, Language mappingTarget) {
        if ( filmDto == null ) {
            return;
        }

        if ( filmDto.getLanguageId() != null ) {
            mappingTarget.setId( filmDto.getLanguageId() );
        }
    }
}
