package gov.iti.jets.web.mapper.rental;


import gov.iti.jets.web.dto.rental.RentalFilmDto;
import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.persistence.entity.Staff;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RentalFilmMappper {

    Film toEntity(RentalFilmDto rentalFilmDto);

    RentalFilmDto toDto(Film film);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Film partialUpdate(RentalFilmDto rentalFilmDto, @MappingTarget Film film);
}
