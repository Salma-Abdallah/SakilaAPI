package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Data
public class AddressDto implements Serializable {
    private Integer id;
    private String address;
    private String address2;
    private String district;

    private String postalCode;
    private String phone;
    private Date lastUpdate;
    private byte[] location;

    public AddressDto() {
    }

    public AddressDto(Integer id, String address, String address2, String district, String postalCode, String phone, Date lastUpdate, byte[] location) {
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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public byte[] getLocation() {
        return location;
    }

    public void setLocation(byte[] location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto that = (AddressDto) o;
        return Objects.equals(id, that.id) && Objects.equals(address, that.address) && Objects.equals(address2, that.address2) && Objects.equals(district, that.district) && Objects.equals(postalCode, that.postalCode) && Objects.equals(phone, that.phone) && Objects.equals(lastUpdate, that.lastUpdate) && Arrays.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, address, address2, district, postalCode, phone, lastUpdate);
        result = 31 * result + Arrays.hashCode(location);
        return result;
    }


}
