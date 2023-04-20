package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.persistence.entity.Language;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T15:34:29+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public LanguageDto toDto(Language language) {
        if ( language == null ) {
            return null;
        }

        LanguageDto languageDto = new LanguageDto();

        languageDto.setId( language.getId() );
        languageDto.setName( language.getName() );
        languageDto.setLastUpdate( language.getLastUpdate() );
        languageDto.setFilms( filmSetToFilmDtoSet( language.getFilms() ) );

        return languageDto;
    }

    @Override
    public Language toEntity(LanguageDto languageDto) {
        if ( languageDto == null ) {
            return null;
        }

        Language language = new Language();

        language.setId( languageDto.getId() );
        language.setName( languageDto.getName() );
        language.setLastUpdate( languageDto.getLastUpdate() );
        language.setFilms( filmDtoSetToFilmSet( languageDto.getFilms() ) );

        return language;
    }

    @Override
    public Language partialUpdate(LanguageDto languageDto, Language language) {
        if ( languageDto == null ) {
            return language;
        }

        if ( languageDto.getId() != null ) {
            language.setId( languageDto.getId() );
        }
        if ( languageDto.getName() != null ) {
            language.setName( languageDto.getName() );
        }
        if ( languageDto.getLastUpdate() != null ) {
            language.setLastUpdate( languageDto.getLastUpdate() );
        }
        if ( language.getFilms() != null ) {
            Set<Film> set = filmDtoSetToFilmSet( languageDto.getFilms() );
            if ( set != null ) {
                language.getFilms().clear();
                language.getFilms().addAll( set );
            }
        }
        else {
            Set<Film> set = filmDtoSetToFilmSet( languageDto.getFilms() );
            if ( set != null ) {
                language.setFilms( set );
            }
        }

        return language;
    }

    protected FilmDto filmToFilmDto(Film film) {
        if ( film == null ) {
            return null;
        }

        FilmDto filmDto = new FilmDto();

        filmDto.setId( film.getId() );
        filmDto.setTitle( film.getTitle() );
        filmDto.setDescription( film.getDescription() );
        filmDto.setReleaseYear( film.getReleaseYear() );
        filmDto.setRentalDuration( film.getRentalDuration() );
        filmDto.setRentalRate( film.getRentalRate() );
        filmDto.setLength( film.getLength() );
        filmDto.setReplacementCost( film.getReplacementCost() );
        filmDto.setRating( film.getRating() );
        filmDto.setSpecialFeatures( film.getSpecialFeatures() );
        filmDto.setLastUpdate( film.getLastUpdate() );

        return filmDto;
    }

    protected Set<FilmDto> filmSetToFilmDtoSet(Set<Film> set) {
        if ( set == null ) {
            return null;
        }

        Set<FilmDto> set1 = new LinkedHashSet<FilmDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Film film : set ) {
            set1.add( filmToFilmDto( film ) );
        }

        return set1;
    }

    protected Film filmDtoToFilm(FilmDto filmDto) {
        if ( filmDto == null ) {
            return null;
        }

        Film film = new Film();

        film.setId( filmDto.getId() );
        film.setTitle( filmDto.getTitle() );
        film.setDescription( filmDto.getDescription() );
        film.setReleaseYear( filmDto.getReleaseYear() );
        film.setRentalDuration( filmDto.getRentalDuration() );
        film.setRentalRate( filmDto.getRentalRate() );
        film.setLength( filmDto.getLength() );
        film.setReplacementCost( filmDto.getReplacementCost() );
        film.setRating( filmDto.getRating() );
        film.setSpecialFeatures( filmDto.getSpecialFeatures() );
        film.setLastUpdate( filmDto.getLastUpdate() );

        return film;
    }

    protected Set<Film> filmDtoSetToFilmSet(Set<FilmDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Film> set1 = new LinkedHashSet<Film>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FilmDto filmDto : set ) {
            set1.add( filmDtoToFilm( filmDto ) );
        }

        return set1;
    }
}
