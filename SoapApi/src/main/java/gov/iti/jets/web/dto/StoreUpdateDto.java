package gov.iti.jets.web.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class StoreUpdateDto implements Serializable {
    private Short id;
    private Short managerStaffId;
    private Integer addressId;
    private Instant lastUpdate = Instant.now();

    public StoreUpdateDto() {
    }

    public StoreUpdateDto(Short id, Short managerStaffId, Integer addressId, Instant lastUpdate) {
        this.id = id;
        this.managerStaffId = managerStaffId;
        this.addressId = addressId;
        this.lastUpdate = lastUpdate;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Short managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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
        StoreUpdateDto that = (StoreUpdateDto) o;
        return Objects.equals(id, that.id) && Objects.equals(managerStaffId, that.managerStaffId) && Objects.equals(addressId, that.addressId) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerStaffId, addressId, lastUpdate);
    }
}
