package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.RentalDto;
import gov.iti.jets.web.persistence.entity.Rental;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RentalMapper {
    @Mapping(source = "staffId", target = "staff.id")
    @Mapping(source = "customerId", target = "customer.id")
    @Mapping(source = "inventoryId", target = "inventory.id")
    Rental toEntity(RentalDto rentalDto);

    @InheritInverseConfiguration(name = "toEntity")
    RentalDto toDto(Rental rental);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Rental partialUpdate(RentalDto rentalDto, @MappingTarget Rental rental);
}
