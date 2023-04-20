package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.RentalDto;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Inventory;
import gov.iti.jets.web.persistence.entity.Rental;
import gov.iti.jets.web.persistence.entity.Staff;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T13:26:04+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class RentalMapperImpl implements RentalMapper {

    @Override
    public Rental toEntity(RentalDto rentalDto) {
        if ( rentalDto == null ) {
            return null;
        }

        Rental rental = new Rental();

        rental.setStaff( rentalDtoToStaff( rentalDto ) );
        rental.setCustomer( rentalDtoToCustomer( rentalDto ) );
        rental.setInventory( rentalDtoToInventory( rentalDto ) );
        rental.setId( rentalDto.getId() );
        rental.setRentalDate( rentalDto.getRentalDate() );
        rental.setReturnDate( rentalDto.getReturnDate() );
        rental.setLastUpdate( rentalDto.getLastUpdate() );

        return rental;
    }

    @Override
    public RentalDto toDto(Rental rental) {
        if ( rental == null ) {
            return null;
        }

        RentalDto rentalDto = new RentalDto();

        rentalDto.setStaffId( rentalStaffId( rental ) );
        rentalDto.setCustomerId( rentalCustomerId( rental ) );
        rentalDto.setInventoryId( rentalInventoryId( rental ) );
        rentalDto.setId( rental.getId() );
        rentalDto.setRentalDate( rental.getRentalDate() );
        rentalDto.setReturnDate( rental.getReturnDate() );
        rentalDto.setLastUpdate( rental.getLastUpdate() );

        return rentalDto;
    }

    @Override
    public Rental partialUpdate(RentalDto rentalDto, Rental rental) {
        if ( rentalDto == null ) {
            return rental;
        }

        if ( rental.getStaff() == null ) {
            rental.setStaff( new Staff() );
        }
        rentalDtoToStaff1( rentalDto, rental.getStaff() );
        if ( rental.getCustomer() == null ) {
            rental.setCustomer( new Customer() );
        }
        rentalDtoToCustomer1( rentalDto, rental.getCustomer() );
        if ( rental.getInventory() == null ) {
            rental.setInventory( new Inventory() );
        }
        rentalDtoToInventory1( rentalDto, rental.getInventory() );
        if ( rentalDto.getId() != null ) {
            rental.setId( rentalDto.getId() );
        }
        if ( rentalDto.getRentalDate() != null ) {
            rental.setRentalDate( rentalDto.getRentalDate() );
        }
        if ( rentalDto.getReturnDate() != null ) {
            rental.setReturnDate( rentalDto.getReturnDate() );
        }
        if ( rentalDto.getLastUpdate() != null ) {
            rental.setLastUpdate( rentalDto.getLastUpdate() );
        }

        return rental;
    }

    protected Staff rentalDtoToStaff(RentalDto rentalDto) {
        if ( rentalDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setId( rentalDto.getStaffId() );

        return staff;
    }

    protected Customer rentalDtoToCustomer(RentalDto rentalDto) {
        if ( rentalDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( rentalDto.getCustomerId() );

        return customer;
    }

    protected Inventory rentalDtoToInventory(RentalDto rentalDto) {
        if ( rentalDto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setId( rentalDto.getInventoryId() );

        return inventory;
    }

    private Short rentalStaffId(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Staff staff = rental.getStaff();
        if ( staff == null ) {
            return null;
        }
        Short id = staff.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer rentalCustomerId(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Customer customer = rental.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Integer id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer rentalInventoryId(Rental rental) {
        if ( rental == null ) {
            return null;
        }
        Inventory inventory = rental.getInventory();
        if ( inventory == null ) {
            return null;
        }
        Integer id = inventory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void rentalDtoToStaff1(RentalDto rentalDto, Staff mappingTarget) {
        if ( rentalDto == null ) {
            return;
        }

        if ( rentalDto.getStaffId() != null ) {
            mappingTarget.setId( rentalDto.getStaffId() );
        }
    }

    protected void rentalDtoToCustomer1(RentalDto rentalDto, Customer mappingTarget) {
        if ( rentalDto == null ) {
            return;
        }

        if ( rentalDto.getCustomerId() != null ) {
            mappingTarget.setId( rentalDto.getCustomerId() );
        }
    }

    protected void rentalDtoToInventory1(RentalDto rentalDto, Inventory mappingTarget) {
        if ( rentalDto == null ) {
            return;
        }

        if ( rentalDto.getInventoryId() != null ) {
            mappingTarget.setId( rentalDto.getInventoryId() );
        }
    }
}
