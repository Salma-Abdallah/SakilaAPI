package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CityDto;
import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.persistence.entity.City;
import gov.iti.jets.web.persistence.entity.Country;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T23:53:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class CityMapperImpl implements CityMapper {

    @Override
    public CityDto toDto(City city) {
        if ( city == null ) {
            return null;
        }

        CityDto cityDto = new CityDto();

        cityDto.setId( city.getId() );
        cityDto.setCity( city.getCity() );
        cityDto.setCountry( countryToCountryDto( city.getCountry() ) );
        cityDto.setLastUpdate( city.getLastUpdate() );

        return cityDto;
    }

    @Override
    public City toEntity(CityDto cityDto) {
        if ( cityDto == null ) {
            return null;
        }

        City city = new City();

        city.setId( cityDto.getId() );
        city.setCity( cityDto.getCity() );
        city.setCountry( countryDtoToCountry( cityDto.getCountry() ) );
        city.setLastUpdate( cityDto.getLastUpdate() );

        return city;
    }

    @Override
    public City partialUpdate(CityDto cityDto, City city) {
        if ( cityDto == null ) {
            return city;
        }

        if ( cityDto.getId() != null ) {
            city.setId( cityDto.getId() );
        }
        if ( cityDto.getCity() != null ) {
            city.setCity( cityDto.getCity() );
        }
        if ( cityDto.getCountry() != null ) {
            if ( city.getCountry() == null ) {
                city.setCountry( new Country() );
            }
            countryDtoToCountry1( cityDto.getCountry(), city.getCountry() );
        }
        if ( cityDto.getLastUpdate() != null ) {
            city.setLastUpdate( cityDto.getLastUpdate() );
        }

        return city;
    }

    protected CountryDto countryToCountryDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setId( country.getId() );
        countryDto.setCountry( country.getCountry() );
        countryDto.setLastUpdate( country.getLastUpdate() );

        return countryDto;
    }

    protected Country countryDtoToCountry(CountryDto countryDto) {
        if ( countryDto == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( countryDto.getId() );
        country.setCountry( countryDto.getCountry() );
        country.setLastUpdate( countryDto.getLastUpdate() );

        return country;
    }

    protected void countryDtoToCountry1(CountryDto countryDto, Country mappingTarget) {
        if ( countryDto == null ) {
            return;
        }

        mappingTarget.setId( countryDto.getId() );
        mappingTarget.setCountry( countryDto.getCountry() );
        mappingTarget.setLastUpdate( countryDto.getLastUpdate() );
    }
}
