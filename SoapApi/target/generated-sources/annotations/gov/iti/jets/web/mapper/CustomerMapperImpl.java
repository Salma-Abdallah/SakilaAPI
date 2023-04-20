package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.persistence.entity.Customer;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:26:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto toDto(Customer source) {
        if ( source == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setActive( source.getActive() );
        if ( source.getCreateDate() != null ) {
            customerDto.setCreateDate( Date.from( source.getCreateDate() ) );
        }
        customerDto.setEmail( source.getEmail() );
        customerDto.setFirstName( source.getFirstName() );
        customerDto.setId( source.getId() );
        customerDto.setLastName( source.getLastName() );
        if ( source.getLastUpdate() != null ) {
            customerDto.setLastUpdate( Date.from( source.getLastUpdate() ) );
        }

        return customerDto;
    }

    @Override
    public Customer toEntity(CustomerDto destination) {
        if ( destination == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setActive( destination.getActive() );
        if ( destination.getCreateDate() != null ) {
            customer.setCreateDate( destination.getCreateDate().toInstant() );
        }
        customer.setEmail( destination.getEmail() );
        customer.setFirstName( destination.getFirstName() );
        customer.setId( destination.getId() );
        customer.setLastName( destination.getLastName() );
        if ( destination.getLastUpdate() != null ) {
            customer.setLastUpdate( destination.getLastUpdate().toInstant() );
        }

        return customer;
    }

    @Override
    public Customer partialUpdate(CustomerDto customerDto, Customer customer) {
        if ( customerDto == null ) {
            return customer;
        }

        if ( customerDto.getActive() != null ) {
            customer.setActive( customerDto.getActive() );
        }
        if ( customerDto.getCreateDate() != null ) {
            customer.setCreateDate( customerDto.getCreateDate().toInstant() );
        }
        if ( customerDto.getEmail() != null ) {
            customer.setEmail( customerDto.getEmail() );
        }
        if ( customerDto.getFirstName() != null ) {
            customer.setFirstName( customerDto.getFirstName() );
        }
        if ( customerDto.getId() != null ) {
            customer.setId( customerDto.getId() );
        }
        if ( customerDto.getLastName() != null ) {
            customer.setLastName( customerDto.getLastName() );
        }
        if ( customerDto.getLastUpdate() != null ) {
            customer.setLastUpdate( customerDto.getLastUpdate().toInstant() );
        }

        return customer;
    }
}
