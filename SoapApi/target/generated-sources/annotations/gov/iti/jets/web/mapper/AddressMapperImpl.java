package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.persistence.entity.Address;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-19T23:05:02+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDto toDto(Address source) {
        if ( source == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setId( source.getId() );
        addressDto.setAddress( source.getAddress() );
        addressDto.setAddress2( source.getAddress2() );
        addressDto.setDistrict( source.getDistrict() );
        addressDto.setPostalCode( source.getPostalCode() );
        addressDto.setPhone( source.getPhone() );
        if ( source.getLastUpdate() != null ) {
            addressDto.setLastUpdate( Date.from( source.getLastUpdate() ) );
        }

        return addressDto;
    }

    @Override
    public Address toEntity(AddressDto destination) {
        if ( destination == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( destination.getId() );
        address.setAddress( destination.getAddress() );
        address.setAddress2( destination.getAddress2() );
        address.setDistrict( destination.getDistrict() );
        address.setPostalCode( destination.getPostalCode() );
        address.setPhone( destination.getPhone() );
        if ( destination.getLastUpdate() != null ) {
            address.setLastUpdate( destination.getLastUpdate().toInstant() );
        }

        return address;
    }

    @Override
    public Address partialUpdate(AddressDto addressDto, Address address) {
        if ( addressDto == null ) {
            return address;
        }

        if ( addressDto.getId() != null ) {
            address.setId( addressDto.getId() );
        }
        if ( addressDto.getAddress() != null ) {
            address.setAddress( addressDto.getAddress() );
        }
        if ( addressDto.getAddress2() != null ) {
            address.setAddress2( addressDto.getAddress2() );
        }
        if ( addressDto.getDistrict() != null ) {
            address.setDistrict( addressDto.getDistrict() );
        }
        if ( addressDto.getPostalCode() != null ) {
            address.setPostalCode( addressDto.getPostalCode() );
        }
        if ( addressDto.getPhone() != null ) {
            address.setPhone( addressDto.getPhone() );
        }
        if ( addressDto.getLastUpdate() != null ) {
            address.setLastUpdate( addressDto.getLastUpdate().toInstant() );
        }

        return address;
    }
}
