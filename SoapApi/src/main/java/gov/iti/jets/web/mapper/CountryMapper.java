package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.persistence.entity.Country;
import org.mapstruct.Mapper;

@Mapper
public interface CountryMapper {
    CountryDto toDto(Country country);
    Country toEntity(CountryDto countryDto);
}
