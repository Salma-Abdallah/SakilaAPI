package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CityDto;
import gov.iti.jets.web.persistence.entity.City;
import org.mapstruct.*;

@Mapper
public interface CityMapper {
    CityDto toDto(City city);

    City toEntity(CityDto cityDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    City partialUpdate(CityDto cityDto, @MappingTarget City city);
}
