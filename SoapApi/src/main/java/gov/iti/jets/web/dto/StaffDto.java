package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Arrays;
import java.util.Objects;

@Data
public class StaffDto implements Serializable {
    private Short id;
    private String firstName;
    private String lastName;
    private Integer addressId;

    private byte[] picture;
    private String email;
    private Short storeId;
    private Boolean active = false;
    private String username;
    private String password;
    private Instant lastUpdate;

    public StaffDto() {
    }

    public StaffDto(Short id, String firstName, String lastName, Integer addressId, byte[] picture, String email, Short storeId, Boolean active, String username, String password, Instant lastUpdate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;

        this.picture = picture;
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.password = password;
        this.lastUpdate = lastUpdate;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getStoreId() {
        return storeId;
    }

    public void setStoreId(Short storeId) {
        this.storeId = storeId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        StaffDto staffDto = (StaffDto) o;
        return Objects.equals(id, staffDto.id) && Objects.equals(firstName, staffDto.firstName) && Objects.equals(lastName, staffDto.lastName) && Objects.equals(addressId, staffDto.addressId) && Arrays.equals(picture, staffDto.picture) && Objects.equals(email, staffDto.email) && Objects.equals(storeId, staffDto.storeId) && Objects.equals(active, staffDto.active) && Objects.equals(username, staffDto.username) && Objects.equals(password, staffDto.password) && Objects.equals(lastUpdate, staffDto.lastUpdate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, firstName, lastName, addressId, email, storeId, active, username, password, lastUpdate);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
