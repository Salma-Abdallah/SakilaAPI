package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.CustomerUpdateDto;
import gov.iti.jets.web.persistence.entity.Customer;
import org.mapstruct.*;

@Mapper
public interface CustomerUpdateMapper {
    Customer toEntity(CustomerUpdateDto customerUpdateDto);

    CustomerUpdateDto toDto(Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Customer partialUpdate(CustomerUpdateDto customerEditDto, @MappingTarget Customer customer);
}
