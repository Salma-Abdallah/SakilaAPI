package gov.iti.jets.web.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

@Data
public class PaymentDto implements Serializable {
    private Integer id;
    private Integer customerId;
    private Short staffId;
    private Integer rentalId;
    private BigDecimal amount;
    private Instant paymentDate;
    private Instant lastUpdate;

    public PaymentDto() {
    }

    public PaymentDto(Integer id, Integer customerId, Short staffId, Integer rentalId, BigDecimal amount, Instant paymentDate, Instant lastUpdate) {
        this.id = id;
        this.customerId = customerId;
        this.staffId = staffId;
        this.rentalId = rentalId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Short getStaffId() {
        return staffId;
    }

    public void setStaffId(Short staffId) {
        this.staffId = staffId;
    }

    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Instant paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentDto that = (PaymentDto) o;
        return Objects.equals(id, that.id) && Objects.equals(customerId, that.customerId) && Objects.equals(staffId, that.staffId) && Objects.equals(rentalId, that.rentalId) && Objects.equals(amount, that.amount) && Objects.equals(paymentDate, that.paymentDate) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, staffId, rentalId, amount, paymentDate, lastUpdate);
    }
}
