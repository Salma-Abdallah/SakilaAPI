package gov.iti.jets.web.dto;

import java.io.Serializable;
import java.time.Instant;

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
}
