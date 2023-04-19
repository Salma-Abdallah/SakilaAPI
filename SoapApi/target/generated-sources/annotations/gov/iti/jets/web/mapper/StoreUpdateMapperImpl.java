package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.StoreUpdateDto;
import gov.iti.jets.web.persistence.entity.Address;
import gov.iti.jets.web.persistence.entity.Staff;
import gov.iti.jets.web.persistence.entity.Store;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-19T23:05:02+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class StoreUpdateMapperImpl implements StoreUpdateMapper {

    @Override
    public Store toEntity(StoreUpdateDto storeEditDto) {
        if ( storeEditDto == null ) {
            return null;
        }

        Store store = new Store();

        store.setAddress( storeUpdateDtoToAddress( storeEditDto ) );
        store.setManagerStaff( storeUpdateDtoToStaff( storeEditDto ) );
        store.setId( storeEditDto.getId() );
        store.setLastUpdate( storeEditDto.getLastUpdate() );

        return store;
    }

    @Override
    public StoreUpdateDto toDto(Store store) {
        if ( store == null ) {
            return null;
        }

        StoreUpdateDto storeUpdateDto = new StoreUpdateDto();

        storeUpdateDto.setAddressId( storeAddressId( store ) );
        storeUpdateDto.setManagerStaffId( storeManagerStaffId( store ) );
        storeUpdateDto.setId( store.getId() );
        storeUpdateDto.setLastUpdate( store.getLastUpdate() );

        return storeUpdateDto;
    }

    @Override
    public Store partialUpdate(StoreUpdateDto storeEditDto, Store store) {
        if ( storeEditDto == null ) {
            return store;
        }

        if ( store.getAddress() == null ) {
            store.setAddress( new Address() );
        }
        storeUpdateDtoToAddress1( storeEditDto, store.getAddress() );
        if ( store.getManagerStaff() == null ) {
            store.setManagerStaff( new Staff() );
        }
        storeUpdateDtoToStaff1( storeEditDto, store.getManagerStaff() );
        if ( storeEditDto.getId() != null ) {
            store.setId( storeEditDto.getId() );
        }
        if ( storeEditDto.getLastUpdate() != null ) {
            store.setLastUpdate( storeEditDto.getLastUpdate() );
        }

        return store;
    }

    protected Address storeUpdateDtoToAddress(StoreUpdateDto storeUpdateDto) {
        if ( storeUpdateDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( storeUpdateDto.getAddressId() );

        return address;
    }

    protected Staff storeUpdateDtoToStaff(StoreUpdateDto storeUpdateDto) {
        if ( storeUpdateDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setId( storeUpdateDto.getManagerStaffId() );

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

    protected void storeUpdateDtoToAddress1(StoreUpdateDto storeUpdateDto, Address mappingTarget) {
        if ( storeUpdateDto == null ) {
            return;
        }

        if ( storeUpdateDto.getAddressId() != null ) {
            mappingTarget.setId( storeUpdateDto.getAddressId() );
        }
    }

    protected void storeUpdateDtoToStaff1(StoreUpdateDto storeUpdateDto, Staff mappingTarget) {
        if ( storeUpdateDto == null ) {
            return;
        }

        if ( storeUpdateDto.getManagerStaffId() != null ) {
            mappingTarget.setId( storeUpdateDto.getManagerStaffId() );
        }
    }
}
