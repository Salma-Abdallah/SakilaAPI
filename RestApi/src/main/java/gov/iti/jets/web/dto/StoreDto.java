package gov.iti.jets.web.dto;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Data
public class StoreDto implements Serializable {
    private Short id;
    private Short managerStaffId;
    private String managerStaffFirstName;
    private String managerStaffLastName;
    private Integer addressId;
    private Instant lastUpdate;

    public StoreDto() {
    }

    public StoreDto(Short id, Short managerStaffId, String managerStaffFirstName, String managerStaffLastName, Integer addressId, Instant lastUpdate) {
        this.id = id;
        this.managerStaffId = managerStaffId;
        this.managerStaffFirstName = managerStaffFirstName;
        this.managerStaffLastName = managerStaffLastName;
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

    public String getManagerStaffFirstName() {
        return managerStaffFirstName;
    }

    public void setManagerStaffFirstName(String managerStaffFirstName) {
        this.managerStaffFirstName = managerStaffFirstName;
    }

    public String getManagerStaffLastName() {
        return managerStaffLastName;
    }

    public void setManagerStaffLastName(String managerStaffLastName) {
        this.managerStaffLastName = managerStaffLastName;
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
