package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.persistence.entity.Store;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreMapper {

    @Mapping(source = "addressId", target = "address.id")
    @Mapping(source = "managerStaffLastName", target = "managerStaff.lastName")
    @Mapping(source = "managerStaffFirstName", target = "managerStaff.firstName")
    @Mapping(source = "managerStaffId", target = "managerStaff.id")
    Store toEntity(StoreDto storeDto);

    @InheritInverseConfiguration(name = "toEntity")
    StoreDto toDto(Store store);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Store partialUpdate(StoreDto storeDto, @MappingTarget Store store);
}
