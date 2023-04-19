package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.StoreUpdateDto;
import gov.iti.jets.web.persistence.entity.Store;
import org.mapstruct.*;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreUpdateMapper {

    @Mapping(source = "addressId", target = "address.id")
    @Mapping(source = "managerStaffId", target = "managerStaff.id")
    Store toEntity(StoreUpdateDto storeEditDto);

    @InheritInverseConfiguration(name = "toEntity")
    StoreUpdateDto toDto(Store store);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Store partialUpdate(StoreUpdateDto storeEditDto, @MappingTarget Store store);
}
