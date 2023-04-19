package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.dto.CustomerUpdateDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Store;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-19T23:05:02+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class CustomerUpdateMapperImpl implements CustomerUpdateMapper {

    @Override
    public Customer toEntity(CustomerUpdateDto customerUpdateDto) {
        if ( customerUpdateDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerUpdateDto.getId() );
        customer.setStore( storeDtoToStore( customerUpdateDto.getStore() ) );
        customer.setFirstName( customerUpdateDto.getFirstName() );
        customer.setLastName( customerUpdateDto.getLastName() );
        customer.setEmail( customerUpdateDto.getEmail() );
        customer.setAddress( addressDtoToAddress( customerUpdateDto.getAddress() ) );
        customer.setActive( customerUpdateDto.getActive() );
        if ( customerUpdateDto.getCreateDate() != null ) {
            customer.setCreateDate( customerUpdateDto.getCreateDate().toInstant() );
        }
        if ( customerUpdateDto.getLastUpdate() != null ) {
            customer.setLastUpdate( customerUpdateDto.getLastUpdate().toInstant() );
        }

        return customer;
    }

    @Override
    public CustomerUpdateDto toDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerUpdateDto customerUpdateDto = new CustomerUpdateDto();

        customerUpdateDto.setId( customer.getId() );
        customerUpdateDto.setStore( storeToStoreDto( customer.getStore() ) );
        customerUpdateDto.setFirstName( customer.getFirstName() );
        customerUpdateDto.setLastName( customer.getLastName() );
        customerUpdateDto.setEmail( customer.getEmail() );
        customerUpdateDto.setActive( customer.getActive() );
        if ( customer.getCreateDate() != null ) {
            customerUpdateDto.setCreateDate( Date.from( customer.getCreateDate() ) );
        }
        if ( customer.getLastUpdate() != null ) {
            customerUpdateDto.setLastUpdate( Date.from( customer.getLastUpdate() ) );
        }
        customerUpdateDto.setAddress( addressToAddressDto( customer.getAddress() ) );

        return customerUpdateDto;
    }

    @Override
    public Customer partialUpdate(CustomerUpdateDto customerEditDto, Customer customer) {
        if ( customerEditDto == null ) {
            return customer;
        }

        if ( customerEditDto.getId() != null ) {
            customer.setId( customerEditDto.getId() );
        }
        if ( customerEditDto.getStore() != null ) {
            if ( customer.getStore() == null ) {
                customer.setStore( new Store() );
            }
            storeDtoToStore1( customerEditDto.getStore(), customer.getStore() );
        }
        if ( customerEditDto.getFirstName() != null ) {
            customer.setFirstName( customerEditDto.getFirstName() );
        }
        if ( customerEditDto.getLastName() != null ) {
            customer.setLastName( customerEditDto.getLastName() );
        }
        if ( customerEditDto.getEmail() != null ) {
            customer.setEmail( customerEditDto.getEmail() );
        }
        if ( customerEditDto.getAddress() != null ) {
            if ( customer.getAddress() == null ) {
                customer.setAddress( new Address() );
            }
            addressDtoToAddress1( customerEditDto.getAddress(), customer.getAddress() );
        }
        if ( customerEditDto.getActive() != null ) {
            customer.setActive( customerEditDto.getActive() );
        }
        if ( customerEditDto.getCreateDate() != null ) {
            customer.setCreateDate( customerEditDto.getCreateDate().toInstant() );
        }
        if ( customerEditDto.getLastUpdate() != null ) {
            customer.setLastUpdate( customerEditDto.getLastUpdate().toInstant() );
        }

        return customer;
    }

    protected Store storeDtoToStore(StoreDto storeDto) {
        if ( storeDto == null ) {
            return null;
        }

        Store store = new Store();

        store.setId( storeDto.getId() );
        store.setLastUpdate( storeDto.getLastUpdate() );

        return store;
    }

    protected Address addressDtoToAddress(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDto.getId() );
        address.setAddress( addressDto.getAddress() );
        address.setAddress2( addressDto.getAddress2() );
        address.setDistrict( addressDto.getDistrict() );
        address.setPostalCode( addressDto.getPostalCode() );
        address.setPhone( addressDto.getPhone() );
        if ( addressDto.getLastUpdate() != null ) {
            address.setLastUpdate( addressDto.getLastUpdate().toInstant() );
        }

        return address;
    }

    protected StoreDto storeToStoreDto(Store store) {
        if ( store == null ) {
            return null;
        }

        StoreDto storeDto = new StoreDto();

        storeDto.setId( store.getId() );
        storeDto.setLastUpdate( store.getLastUpdate() );

        return storeDto;
    }

    protected AddressDto addressToAddressDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setId( address.getId() );
        addressDto.setAddress( address.getAddress() );
        addressDto.setAddress2( address.getAddress2() );
        addressDto.setDistrict( address.getDistrict() );
        addressDto.setPostalCode( address.getPostalCode() );
        addressDto.setPhone( address.getPhone() );
        if ( address.getLastUpdate() != null ) {
            addressDto.setLastUpdate( Date.from( address.getLastUpdate() ) );
        }

        return addressDto;
    }

    protected void storeDtoToStore1(StoreDto storeDto, Store mappingTarget) {
        if ( storeDto == null ) {
            return;
        }

        mappingTarget.setId( storeDto.getId() );
        mappingTarget.setLastUpdate( storeDto.getLastUpdate() );
    }

    protected void addressDtoToAddress1(AddressDto addressDto, Address mappingTarget) {
        if ( addressDto == null ) {
            return;
        }

        mappingTarget.setId( addressDto.getId() );
        mappingTarget.setAddress( addressDto.getAddress() );
        mappingTarget.setAddress2( addressDto.getAddress2() );
        mappingTarget.setDistrict( addressDto.getDistrict() );
        mappingTarget.setPostalCode( addressDto.getPostalCode() );
        mappingTarget.setPhone( addressDto.getPhone() );
        if ( addressDto.getLastUpdate() != null ) {
            mappingTarget.setLastUpdate( addressDto.getLastUpdate().toInstant() );
        }
        else {
            mappingTarget.setLastUpdate( null );
        }
    }
}
