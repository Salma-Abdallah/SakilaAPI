package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.AddressUpdateDto;
import gov.iti.jets.web.persistence.entity.Address;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:42:02+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class AddressUpdateMapperImpl implements AddressUpdateMapper {

    @Override
    public Address toEntity(AddressUpdateDto addressEditDto) {
        if ( addressEditDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressEditDto.getId() );
        address.setAddress( addressEditDto.getAddress() );
        address.setAddress2( addressEditDto.getAddress2() );
        address.setDistrict( addressEditDto.getDistrict() );
        address.setPostalCode( addressEditDto.getPostalCode() );
        address.setPhone( addressEditDto.getPhone() );
        address.setLastUpdate( addressEditDto.getLastUpdate() );

        return address;
    }

    @Override
    public AddressUpdateDto toDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressUpdateDto addressUpdateDto = new AddressUpdateDto();

        addressUpdateDto.setId( address.getId() );
        addressUpdateDto.setAddress( address.getAddress() );
        addressUpdateDto.setAddress2( address.getAddress2() );
        addressUpdateDto.setDistrict( address.getDistrict() );
        addressUpdateDto.setPostalCode( address.getPostalCode() );
        addressUpdateDto.setPhone( address.getPhone() );
        addressUpdateDto.setLastUpdate( address.getLastUpdate() );

        return addressUpdateDto;
    }

    @Override
    public Address partialUpdate(AddressUpdateDto addressEditDto, Address address) {
        if ( addressEditDto == null ) {
            return address;
        }

        if ( addressEditDto.getId() != null ) {
            address.setId( addressEditDto.getId() );
        }
        if ( addressEditDto.getAddress() != null ) {
            address.setAddress( addressEditDto.getAddress() );
        }
        if ( addressEditDto.getAddress2() != null ) {
            address.setAddress2( addressEditDto.getAddress2() );
        }
        if ( addressEditDto.getDistrict() != null ) {
            address.setDistrict( addressEditDto.getDistrict() );
        }
        if ( addressEditDto.getPostalCode() != null ) {
            address.setPostalCode( addressEditDto.getPostalCode() );
        }
        if ( addressEditDto.getPhone() != null ) {
            address.setPhone( addressEditDto.getPhone() );
        }
        if ( addressEditDto.getLastUpdate() != null ) {
            address.setLastUpdate( addressEditDto.getLastUpdate() );
        }

        return address;
    }
}
