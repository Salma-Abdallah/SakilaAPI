package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.AddressUpdateDto;
import gov.iti.jets.web.persistence.entity.Address;
import org.mapstruct.*;

@Mapper
public interface AddressUpdateMapper {
    Address toEntity(AddressUpdateDto addressEditDto);

    AddressUpdateDto toDto(Address address);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Address partialUpdate(AddressUpdateDto addressEditDto, @MappingTarget Address address);

}
