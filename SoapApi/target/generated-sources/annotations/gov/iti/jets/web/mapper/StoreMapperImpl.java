package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Staff;
import gov.iti.jets.web.persistence.entity.Store;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T23:53:58+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class StoreMapperImpl implements StoreMapper {

    @Override
    public Store toEntity(StoreDto storeDto) {
        if ( storeDto == null ) {
            return null;
        }

        Store store = new Store();

        store.setAddress( storeDtoToAddress( storeDto ) );
        store.setManagerStaff( storeDtoToStaff( storeDto ) );
        store.setId( storeDto.getId() );
        store.setLastUpdate( storeDto.getLastUpdate() );

        return store;
    }

    @Override
    public StoreDto toDto(Store store) {
        if ( store == null ) {
            return null;
        }

        StoreDto storeDto = new StoreDto();

        storeDto.setAddressId( storeAddressId( store ) );
        storeDto.setManagerStaffLastName( storeManagerStaffLastName( store ) );
        storeDto.setManagerStaffFirstName( storeManagerStaffFirstName( store ) );
        storeDto.setManagerStaffId( storeManagerStaffId( store ) );
        storeDto.setId( store.getId() );
        storeDto.setLastUpdate( store.getLastUpdate() );

        return storeDto;
    }

    @Override
    public Store partialUpdate(StoreDto storeDto, Store store) {
        if ( storeDto == null ) {
            return store;
        }

        if ( store.getAddress() == null ) {
            store.setAddress( new Address() );
        }
        storeDtoToAddress1( storeDto, store.getAddress() );
        if ( store.getManagerStaff() == null ) {
            store.setManagerStaff( new Staff() );
        }
        storeDtoToStaff1( storeDto, store.getManagerStaff() );
        if ( storeDto.getId() != null ) {
            store.setId( storeDto.getId() );
        }
        if ( storeDto.getLastUpdate() != null ) {
            store.setLastUpdate( storeDto.getLastUpdate() );
        }

        return store;
    }

    protected Address storeDtoToAddress(StoreDto storeDto) {
        if ( storeDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( storeDto.getAddressId() );

        return address;
    }

    protected Staff storeDtoToStaff(StoreDto storeDto) {
        if ( storeDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setLastName( storeDto.getManagerStaffLastName() );
        staff.setFirstName( storeDto.getManagerStaffFirstName() );
        staff.setId( storeDto.getManagerStaffId() );

        return staff;
    }

    private Integer storeAddressId(Store store) {
        if ( store == null ) {
            return null;
        }
        Address address = store.getAddress();
        if ( address == null ) {
            return null;
        }
        Integer id = address.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String storeManagerStaffLastName(Store store) {
        if ( store == null ) {
            return null;
        }
        Staff managerStaff = store.getManagerStaff();
        if ( managerStaff == null ) {
            return null;
        }
        String lastName = managerStaff.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String storeManagerStaffFirstName(Store store) {
        if ( store == null ) {
            return null;
        }
        Staff managerStaff = store.getManagerStaff();
        if ( managerStaff == null ) {
            return null;
        }
        String firstName = managerStaff.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private Short storeManagerStaffId(Store store) {
        if ( store == null ) {
            return null;
        }
        Staff managerStaff = store.getManagerStaff();
        if ( managerStaff == null ) {
            return null;
        }
        Short id = managerStaff.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void storeDtoToAddress1(StoreDto storeDto, Address mappingTarget) {
        if ( storeDto == null ) {
            return;
        }

        if ( storeDto.getAddressId() != null ) {
            mappingTarget.setId( storeDto.getAddressId() );
        }
    }

    protected void storeDtoToStaff1(StoreDto storeDto, Staff mappingTarget) {
        if ( storeDto == null ) {
            return;
        }

        if ( storeDto.getManagerStaffLastName() != null ) {
            mappingTarget.setLastName( storeDto.getManagerStaffLastName() );
        }
        if ( storeDto.getManagerStaffFirstName() != null ) {
            mappingTarget.setFirstName( storeDto.getManagerStaffFirstName() );
        }
        if ( storeDto.getManagerStaffId() != null ) {
            mappingTarget.setId( storeDto.getManagerStaffId() );
        }
    }
}
