package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.persistence.entity.Staff;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:42:02+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class RentalStaffMapperImpl implements RentalStaffMapper {

    @Override
    public Staff toEntity(RentalStaffDto rentalStaffDto) {
        if ( rentalStaffDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setId( rentalStaffDto.getId() );
        staff.setFirstName( rentalStaffDto.getFirstName() );
        staff.setLastName( rentalStaffDto.getLastName() );

        return staff;
    }

    @Override
    public RentalStaffDto toDto(Staff staff) {
        if ( staff == null ) {
            return null;
        }

        RentalStaffDto rentalStaffDto = new RentalStaffDto();

        rentalStaffDto.setId( staff.getId() );
        rentalStaffDto.setFirstName( staff.getFirstName() );
        rentalStaffDto.setLastName( staff.getLastName() );

        return rentalStaffDto;
    }

    @Override
    public Staff partialUpdate(RentalStaffDto staffRentalDto, Staff staff) {
        if ( staffRentalDto == null ) {
            return staff;
        }

        if ( staffRentalDto.getId() != null ) {
            staff.setId( staffRentalDto.getId() );
        }
        if ( staffRentalDto.getFirstName() != null ) {
            staff.setFirstName( staffRentalDto.getFirstName() );
        }
        if ( staffRentalDto.getLastName() != null ) {
            staff.setLastName( staffRentalDto.getLastName() );
        }

        return staff;
    }
}
