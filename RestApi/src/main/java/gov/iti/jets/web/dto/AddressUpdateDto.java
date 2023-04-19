package gov.iti.jets.web.dto;

import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
public class AddressUpdateDto implements Serializable {
    private Integer id;
    private String address;
    private String address2;
    private String district;

    private String postalCode;
    private String phone;
    private Instant lastUpdate;
    private byte[] location;

    public AddressUpdateDto() {
    }

    public AddressUpdateDto(Integer id, String address, String address2, String district, String postalCode, String phone, Instant lastUpdate, byte[] location) {
        this.id = id;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }
}
