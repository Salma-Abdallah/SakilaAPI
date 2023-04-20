package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.persistence.entity.Country;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:42:01+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class CountryMapperImpl implements CountryMapper {

    @Override
    public CountryDto toDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setId( country.getId() );
        countryDto.setCountry( country.getCountry() );
        countryDto.setLastUpdate( country.getLastUpdate() );

        return countryDto;
    }

    @Override
    public Country toEntity(CountryDto countryDto) {
        if ( countryDto == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( countryDto.getId() );
        country.setCountry( countryDto.getCountry() );
        country.setLastUpdate( countryDto.getLastUpdate() );

        return country;
    }
}
