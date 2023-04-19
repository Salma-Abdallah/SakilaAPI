package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.persistence.entity.Staff;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RentalStaffMapper {
    Staff toEntity(RentalStaffDto rentalStaffDto);

    RentalStaffDto toDto(Staff staff);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Staff partialUpdate(RentalStaffDto staffRentalDto, @MappingTarget Staff staff);
}
