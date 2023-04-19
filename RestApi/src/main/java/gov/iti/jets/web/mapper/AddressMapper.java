package gov.iti.jets.web.mapper;


import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.persistence.entity.Address;
import org.mapstruct.*;

@Mapper
public interface AddressMapper {
    AddressDto toDto(Address source);
    Address toEntity(AddressDto destination);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Address partialUpdate(AddressDto addressDto, @MappingTarget Address address);
}
