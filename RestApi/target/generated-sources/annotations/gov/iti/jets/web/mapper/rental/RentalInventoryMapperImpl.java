package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.persistence.entity.Inventory;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T16:38:33+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class RentalInventoryMapperImpl implements RentalInventoryMapper {

    @Override
    public Inventory toEntity(RentalInventoryDto rentalInventoryDto) {
        if ( rentalInventoryDto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        return inventory;
    }

    @Override
    public RentalInventoryDto toDto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        RentalInventoryDto rentalInventoryDto = new RentalInventoryDto();

        return rentalInventoryDto;
    }

    @Override
    public Inventory partialUpdate(RentalInventoryDto inventoryRentalDto, Inventory inventory) {
        if ( inventoryRentalDto == null ) {
            return inventory;
        }

        return inventory;
    }
}
