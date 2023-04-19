package gov.iti.jets.web.mapper.rental;

import gov.iti.jets.web.dto.rental.RentalCustomerDto;
import gov.iti.jets.web.persistence.entity.Customer;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RentalCustomerMapper {
    Customer toEntity(RentalCustomerDto rentalCustomerDto);

    RentalCustomerDto toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(RentalCustomerDto customerRentalDto, @MappingTarget Customer customer);
}
