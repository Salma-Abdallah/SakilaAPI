package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalFilmDto;
import gov.iti.jets.web.persistence.entity.Film;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T13:26:04+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class RentalFilmMappperImpl implements RentalFilmMappper {

    @Override
    public Film toEntity(RentalFilmDto rentalFilmDto) {
        if ( rentalFilmDto == null ) {
            return null;
        }

        Film film = new Film();

        film.setId( rentalFilmDto.getId() );
        film.setTitle( rentalFilmDto.getTitle() );

        return film;
    }

    @Override
    public RentalFilmDto toDto(Film film) {
        if ( film == null ) {
            return null;
        }

        RentalFilmDto rentalFilmDto = new RentalFilmDto();

        rentalFilmDto.setId( film.getId() );
        rentalFilmDto.setTitle( film.getTitle() );

        return rentalFilmDto;
    }

    @Override
    public Film partialUpdate(RentalFilmDto rentalFilmDto, Film film) {
        if ( rentalFilmDto == null ) {
            return film;
        }

        if ( rentalFilmDto.getId() != null ) {
            film.setId( rentalFilmDto.getId() );
        }
        if ( rentalFilmDto.getTitle() != null ) {
            film.setTitle( rentalFilmDto.getTitle() );
        }

        return film;
    }
}
