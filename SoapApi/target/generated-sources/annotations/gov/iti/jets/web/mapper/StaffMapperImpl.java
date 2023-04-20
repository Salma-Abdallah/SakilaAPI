package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.StaffDto;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Staff;
import gov.iti.jets.web.persistence.entity.Store;
import java.util.Arrays;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:26:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class StaffMapperImpl implements StaffMapper {

    @Override
    public Staff toEntity(StaffDto staffDto) {
        if ( staffDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setStore( staffDtoToStore( staffDto ) );
        staff.setAddress( staffDtoToAddress( staffDto ) );
        staff.setActive( staffDto.getActive() );
        staff.setEmail( staffDto.getEmail() );
        staff.setFirstName( staffDto.getFirstName() );
        staff.setId( staffDto.getId() );
        staff.setLastName( staffDto.getLastName() );
        staff.setLastUpdate( staffDto.getLastUpdate() );
        staff.setPassword( staffDto.getPassword() );
        byte[] picture = staffDto.getPicture();
        if ( picture != null ) {
            staff.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        staff.setUsername( staffDto.getUsername() );

        return staff;
    }

    @Override
    public StaffDto toDto(Staff staff) {
        if ( staff == null ) {
            return null;
        }

        StaffDto staffDto = new StaffDto();

        staffDto.setStoreId( staffStoreId( staff ) );
        staffDto.setAddressId( staffAddressId( staff ) );
        staffDto.setActive( staff.getActive() );
        staffDto.setEmail( staff.getEmail() );
        staffDto.setFirstName( staff.getFirstName() );
        staffDto.setId( staff.getId() );
        staffDto.setLastName( staff.getLastName() );
        staffDto.setLastUpdate( staff.getLastUpdate() );
        staffDto.setPassword( staff.getPassword() );
        byte[] picture = staff.getPicture();
        if ( picture != null ) {
            staffDto.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        staffDto.setUsername( staff.getUsername() );

        return staffDto;
    }

    @Override
    public Staff partialUpdate(StaffDto staffDto, Staff staff) {
        if ( staffDto == null ) {
            return staff;
        }

        if ( staff.getStore() == null ) {
            staff.setStore( new Store() );
        }
        staffDtoToStore1( staffDto, staff.getStore() );
        if ( staff.getAddress() == null ) {
            staff.setAddress( new Address() );
        }
        staffDtoToAddress1( staffDto, staff.getAddress() );
        if ( staffDto.getActive() != null ) {
            staff.setActive( staffDto.getActive() );
        }
        if ( staffDto.getEmail() != null ) {
            staff.setEmail( staffDto.getEmail() );
        }
        if ( staffDto.getFirstName() != null ) {
            staff.setFirstName( staffDto.getFirstName() );
        }
        if ( staffDto.getId() != null ) {
            staff.setId( staffDto.getId() );
        }
        if ( staffDto.getLastName() != null ) {
            staff.setLastName( staffDto.getLastName() );
        }
        if ( staffDto.getLastUpdate() != null ) {
            staff.setLastUpdate( staffDto.getLastUpdate() );
        }
        if ( staffDto.getPassword() != null ) {
            staff.setPassword( staffDto.getPassword() );
        }
        byte[] picture = staffDto.getPicture();
        if ( picture != null ) {
            staff.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        if ( staffDto.getUsername() != null ) {
            staff.setUsername( staffDto.getUsername() );
        }

        return staff;
    }

    protected Store staffDtoToStore(StaffDto staffDto) {
        if ( staffDto == null ) {
            return null;
        }

        Store store = new Store();

        store.setId( staffDto.getStoreId() );

        return store;
    }

    protected Address staffDtoToAddress(StaffDto staffDto) {
        if ( staffDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( staffDto.getAddressId() );

        return address;
    }

    private Short staffStoreId(Staff staff) {
        if ( staff == null ) {
            return null;
        }
        Store store = staff.getStore();
        if ( store == null ) {
            return null;
        }
        Short id = store.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer staffAddressId(Staff staff) {
        if ( staff == null ) {
            return null;
        }
        Address address = staff.getAddress();
        if ( address == null ) {
            return null;
        }
        Integer id = address.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void staffDtoToStore1(StaffDto staffDto, Store mappingTarget) {
        if ( staffDto == null ) {
            return;
        }

        if ( staffDto.getStoreId() != null ) {
            mappingTarget.setId( staffDto.getStoreId() );
        }
    }

    protected void staffDtoToAddress1(StaffDto staffDto, Address mappingTarget) {
        if ( staffDto == null ) {
            return;
        }

        if ( staffDto.getAddressId() != null ) {
            mappingTarget.setId( staffDto.getAddressId() );
        }
    }
}
