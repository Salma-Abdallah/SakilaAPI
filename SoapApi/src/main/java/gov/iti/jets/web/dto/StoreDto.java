package gov.iti.jets.web.dto;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreDto storeDto = (StoreDto) o;
        return Objects.equals(id, storeDto.id) && Objects.equals(managerStaffId, storeDto.managerStaffId) && Objects.equals(managerStaffFirstName, storeDto.managerStaffFirstName) && Objects.equals(managerStaffLastName, storeDto.managerStaffLastName) && Objects.equals(addressId, storeDto.addressId) && Objects.equals(lastUpdate, storeDto.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, managerStaffId, managerStaffFirstName, managerStaffLastName, addressId, lastUpdate);
    }
}
