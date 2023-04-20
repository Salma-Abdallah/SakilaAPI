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
    date = "2023-04-20T14:26:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class CustomerUpdateMapperImpl implements CustomerUpdateMapper {

    @Override
    public Customer toEntity(CustomerUpdateDto customerUpdateDto) {
        if ( customerUpdateDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setActive( customerUpdateDto.getActive() );
        customer.setAddress( addressDtoToAddress( customerUpdateDto.getAddress() ) );
        if ( customerUpdateDto.getCreateDate() != null ) {
            customer.setCreateDate( customerUpdateDto.getCreateDate().toInstant() );
        }
        customer.setEmail( customerUpdateDto.getEmail() );
        customer.setFirstName( customerUpdateDto.getFirstName() );
        customer.setId( customerUpdateDto.getId() );
        customer.setLastName( customerUpdateDto.getLastName() );
        if ( customerUpdateDto.getLastUpdate() != null ) {
            customer.setLastUpdate( customerUpdateDto.getLastUpdate().toInstant() );
        }
        customer.setStore( storeDtoToStore( customerUpdateDto.getStore() ) );

        return customer;
    }

    @Override
    public CustomerUpdateDto toDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerUpdateDto customerUpdateDto = new CustomerUpdateDto();

        customerUpdateDto.setActive( customer.getActive() );
        customerUpdateDto.setAddress( addressToAddressDto( customer.getAddress() ) );
        if ( customer.getCreateDate() != null ) {
            customerUpdateDto.setCreateDate( Date.from( customer.getCreateDate() ) );
        }
        customerUpdateDto.setEmail( customer.getEmail() );
        customerUpdateDto.setFirstName( customer.getFirstName() );
        customerUpdateDto.setId( customer.getId() );
        customerUpdateDto.setLastName( customer.getLastName() );
        if ( customer.getLastUpdate() != null ) {
            customerUpdateDto.setLastUpdate( Date.from( customer.getLastUpdate() ) );
        }
        customerUpdateDto.setStore( storeToStoreDto( customer.getStore() ) );

        return customerUpdateDto;
    }

    @Override
    public Customer partialUpdate(CustomerUpdateDto customerEditDto, Customer customer) {
        if ( customerEditDto == null ) {
            return customer;
        }

        if ( customerEditDto.getActive() != null ) {
            customer.setActive( customerEditDto.getActive() );
        }
        if ( customerEditDto.getAddress() != null ) {
            if ( customer.getAddress() == null ) {
                customer.setAddress( new Address() );
            }
            addressDtoToAddress1( customerEditDto.getAddress(), customer.getAddress() );
        }
        if ( customerEditDto.getCreateDate() != null ) {
            customer.setCreateDate( customerEditDto.getCreateDate().toInstant() );
        }
        if ( customerEditDto.getEmail() != null ) {
            customer.setEmail( customerEditDto.getEmail() );
        }
        if ( customerEditDto.getFirstName() != null ) {
            customer.setFirstName( customerEditDto.getFirstName() );
        }
        if ( customerEditDto.getId() != null ) {
            customer.setId( customerEditDto.getId() );
        }
        if ( customerEditDto.getLastName() != null ) {
            customer.setLastName( customerEditDto.getLastName() );
        }
        if ( customerEditDto.getLastUpdate() != null ) {
            customer.setLastUpdate( customerEditDto.getLastUpdate().toInstant() );
        }
        if ( customerEditDto.getStore() != null ) {
            if ( customer.getStore() == null ) {
                customer.setStore( new Store() );
            }
            storeDtoToStore1( customerEditDto.getStore(), customer.getStore() );
        }

        return customer;
    }

    protected Address addressDtoToAddress(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddress( addressDto.getAddress() );
        address.setAddress2( addressDto.getAddress2() );
        address.setDistrict( addressDto.getDistrict() );
        address.setId( addressDto.getId() );
        if ( addressDto.getLastUpdate() != null ) {
            address.setLastUpdate( addressDto.getLastUpdate().toInstant() );
        }
        address.setPhone( addressDto.getPhone() );
        address.setPostalCode( addressDto.getPostalCode() );

        return address;
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

    protected AddressDto addressToAddressDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setAddress( address.getAddress() );
        addressDto.setAddress2( address.getAddress2() );
        addressDto.setDistrict( address.getDistrict() );
        addressDto.setId( address.getId() );
        if ( address.getLastUpdate() != null ) {
            addressDto.setLastUpdate( Date.from( address.getLastUpdate() ) );
        }
        addressDto.setPhone( address.getPhone() );
        addressDto.setPostalCode( address.getPostalCode() );

        return addressDto;
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

    protected void addressDtoToAddress1(AddressDto addressDto, Address mappingTarget) {
        if ( addressDto == null ) {
            return;
        }

        mappingTarget.setAddress( addressDto.getAddress() );
        mappingTarget.setAddress2( addressDto.getAddress2() );
        mappingTarget.setDistrict( addressDto.getDistrict() );
        mappingTarget.setId( addressDto.getId() );
        if ( addressDto.getLastUpdate() != null ) {
            mappingTarget.setLastUpdate( addressDto.getLastUpdate().toInstant() );
        }
        else {
            mappingTarget.setLastUpdate( null );
        }
        mappingTarget.setPhone( addressDto.getPhone() );
        mappingTarget.setPostalCode( addressDto.getPostalCode() );
    }

    protected void storeDtoToStore1(StoreDto storeDto, Store mappingTarget) {
        if ( storeDto == null ) {
            return;
        }

        mappingTarget.setId( storeDto.getId() );
        mappingTarget.setLastUpdate( storeDto.getLastUpdate() );
    }
}
