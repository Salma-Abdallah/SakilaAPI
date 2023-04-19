package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.persistence.entity.Customer;
import org.mapstruct.*;

@Mapper
public interface CustomerMapper {
    CustomerDto toDto(Customer source);

    Customer toEntity(CustomerDto destination);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(CustomerDto customerDto, @MappingTarget Customer customer);
}
