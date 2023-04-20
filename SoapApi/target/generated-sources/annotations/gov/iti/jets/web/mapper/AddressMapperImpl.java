package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.AddressDto;
import gov.iti.jets.web.persistence.entity.Address;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:26:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDto toDto(Address source) {
        if ( source == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setAddress( source.getAddress() );
        addressDto.setAddress2( source.getAddress2() );
        addressDto.setDistrict( source.getDistrict() );
        addressDto.setId( source.getId() );
        if ( source.getLastUpdate() != null ) {
            addressDto.setLastUpdate( Date.from( source.getLastUpdate() ) );
        }
        addressDto.setPhone( source.getPhone() );
        addressDto.setPostalCode( source.getPostalCode() );

        return addressDto;
    }

    @Override
    public Address toEntity(AddressDto destination) {
        if ( destination == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddress( destination.getAddress() );
        address.setAddress2( destination.getAddress2() );
        address.setDistrict( destination.getDistrict() );
        address.setId( destination.getId() );
        if ( destination.getLastUpdate() != null ) {
            address.setLastUpdate( destination.getLastUpdate().toInstant() );
        }
        address.setPhone( destination.getPhone() );
        address.setPostalCode( destination.getPostalCode() );

        return address;
    }

    @Override
    public Address partialUpdate(AddressDto addressDto, Address address) {
        if ( addressDto == null ) {
            return address;
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
        if ( addressDto.getId() != null ) {
            address.setId( addressDto.getId() );
        }
        if ( addressDto.getLastUpdate() != null ) {
            address.setLastUpdate( addressDto.getLastUpdate().toInstant() );
        }
        if ( addressDto.getPhone() != null ) {
            address.setPhone( addressDto.getPhone() );
        }
        if ( addressDto.getPostalCode() != null ) {
            address.setPostalCode( addressDto.getPostalCode() );
        }

        return address;
    }
}
