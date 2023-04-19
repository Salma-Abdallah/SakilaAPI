package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.PaymentDto;
import gov.iti.jets.web.persistence.entity.Payment;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentMapper {
    @Mapping(source = "staffId", target = "staff.id")
    @Mapping(source = "customerId", target = "customer.id")
    @Mapping(source = "rentalId", target = "rental.id")
    Payment toEntity(PaymentDto paymentDto);

    @InheritInverseConfiguration(name = "toEntity")
    PaymentDto toDto(Payment payment);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Payment partialUpdate(PaymentDto paymentDto, @MappingTarget Payment payment);

}
