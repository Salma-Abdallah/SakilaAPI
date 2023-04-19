package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.persistence.entity.Inventory;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RentalInventoryMapper {

    Inventory toEntity(RentalInventoryDto rentalInventoryDto);

    RentalInventoryDto toDto(Inventory inventory);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Inventory partialUpdate(RentalInventoryDto inventoryRentalDto, @MappingTarget Inventory inventory);
}
