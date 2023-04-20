package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalCustomerDto;
import gov.iti.jets.web.persistence.entity.Customer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T15:34:29+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class RentalCustomerMapperImpl implements RentalCustomerMapper {

    @Override
    public Customer toEntity(RentalCustomerDto rentalCustomerDto) {
        if ( rentalCustomerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( rentalCustomerDto.getId() );
        customer.setFirstName( rentalCustomerDto.getFirstName() );
        customer.setLastName( rentalCustomerDto.getLastName() );

        return customer;
    }

    @Override
    public RentalCustomerDto toDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        RentalCustomerDto rentalCustomerDto = new RentalCustomerDto();

        rentalCustomerDto.setId( customer.getId() );
        rentalCustomerDto.setFirstName( customer.getFirstName() );
        rentalCustomerDto.setLastName( customer.getLastName() );

        return rentalCustomerDto;
    }

    @Override
    public Customer partialUpdate(RentalCustomerDto customerRentalDto, Customer customer) {
        if ( customerRentalDto == null ) {
            return customer;
        }

        if ( customerRentalDto.getId() != null ) {
            customer.setId( customerRentalDto.getId() );
        }
        if ( customerRentalDto.getFirstName() != null ) {
            customer.setFirstName( customerRentalDto.getFirstName() );
        }
        if ( customerRentalDto.getLastName() != null ) {
            customer.setLastName( customerRentalDto.getLastName() );
        }

        return customer;
    }
}
