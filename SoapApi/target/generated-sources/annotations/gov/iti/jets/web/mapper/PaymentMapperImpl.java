package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.PaymentDto;
import gov.iti.jets.web.persistence.entity.Customer;
import gov.iti.jets.web.persistence.entity.Payment;
import gov.iti.jets.web.persistence.entity.Rental;
import gov.iti.jets.web.persistence.entity.Staff;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T14:42:01+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public Payment toEntity(PaymentDto paymentDto) {
        if ( paymentDto == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setStaff( paymentDtoToStaff( paymentDto ) );
        payment.setCustomer( paymentDtoToCustomer( paymentDto ) );
        payment.setRental( paymentDtoToRental( paymentDto ) );
        payment.setId( paymentDto.getId() );
        payment.setAmount( paymentDto.getAmount() );
        payment.setPaymentDate( paymentDto.getPaymentDate() );
        payment.setLastUpdate( paymentDto.getLastUpdate() );

        return payment;
    }

    @Override
    public PaymentDto toDto(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentDto paymentDto = new PaymentDto();

        paymentDto.setStaffId( paymentStaffId( payment ) );
        paymentDto.setCustomerId( paymentCustomerId( payment ) );
        paymentDto.setRentalId( paymentRentalId( payment ) );
        paymentDto.setId( payment.getId() );
        paymentDto.setAmount( payment.getAmount() );
        paymentDto.setPaymentDate( payment.getPaymentDate() );
        paymentDto.setLastUpdate( payment.getLastUpdate() );

        return paymentDto;
    }

    @Override
    public Payment partialUpdate(PaymentDto paymentDto, Payment payment) {
        if ( paymentDto == null ) {
            return payment;
        }

        if ( payment.getStaff() == null ) {
            payment.setStaff( new Staff() );
        }
        paymentDtoToStaff1( paymentDto, payment.getStaff() );
        if ( payment.getCustomer() == null ) {
            payment.setCustomer( new Customer() );
        }
        paymentDtoToCustomer1( paymentDto, payment.getCustomer() );
        if ( payment.getRental() == null ) {
            payment.setRental( new Rental() );
        }
        paymentDtoToRental1( paymentDto, payment.getRental() );
        if ( paymentDto.getId() != null ) {
            payment.setId( paymentDto.getId() );
        }
        if ( paymentDto.getAmount() != null ) {
            payment.setAmount( paymentDto.getAmount() );
        }
        if ( paymentDto.getPaymentDate() != null ) {
            payment.setPaymentDate( paymentDto.getPaymentDate() );
        }
        if ( paymentDto.getLastUpdate() != null ) {
            payment.setLastUpdate( paymentDto.getLastUpdate() );
        }

        return payment;
    }

    protected Staff paymentDtoToStaff(PaymentDto paymentDto) {
        if ( paymentDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setId( paymentDto.getStaffId() );

        return staff;
    }

    protected Customer paymentDtoToCustomer(PaymentDto paymentDto) {
        if ( paymentDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( paymentDto.getCustomerId() );

        return customer;
    }

    protected Rental paymentDtoToRental(PaymentDto paymentDto) {
        if ( paymentDto == null ) {
            return null;
        }

        Rental rental = new Rental();

        rental.setId( paymentDto.getRentalId() );

        return rental;
    }

    private Short paymentStaffId(Payment payment) {
        if ( payment == null ) {
            return null;
        }
        Staff staff = payment.getStaff();
        if ( staff == null ) {
            return null;
        }
        Short id = staff.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer paymentCustomerId(Payment payment) {
        if ( payment == null ) {
            return null;
        }
        Customer customer = payment.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Integer id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer paymentRentalId(Payment payment) {
        if ( payment == null ) {
            return null;
        }
        Rental rental = payment.getRental();
        if ( rental == null ) {
            return null;
        }
        Integer id = rental.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void paymentDtoToStaff1(PaymentDto paymentDto, Staff mappingTarget) {
        if ( paymentDto == null ) {
            return;
        }

        if ( paymentDto.getStaffId() != null ) {
            mappingTarget.setId( paymentDto.getStaffId() );
        }
    }

    protected void paymentDtoToCustomer1(PaymentDto paymentDto, Customer mappingTarget) {
        if ( paymentDto == null ) {
            return;
        }

        if ( paymentDto.getCustomerId() != null ) {
            mappingTarget.setId( paymentDto.getCustomerId() );
        }
    }

    protected void paymentDtoToRental1(PaymentDto paymentDto, Rental mappingTarget) {
        if ( paymentDto == null ) {
            return;
        }

        if ( paymentDto.getRentalId() != null ) {
            mappingTarget.setId( paymentDto.getRentalId() );
        }
    }
}
