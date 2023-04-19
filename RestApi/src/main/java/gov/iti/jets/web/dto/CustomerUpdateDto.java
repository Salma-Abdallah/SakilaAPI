package gov.iti.jets.web.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
public class CustomerUpdateDto implements Serializable {
    private Integer id;
    private StoreDto store;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;
    private Date createDate;
    private Date lastUpdate;

    private AddressDto address;

    public CustomerUpdateDto() {
    }

    public CustomerUpdateDto(Integer id, StoreDto store, String firstName, String lastName, String email, Boolean active, Date createDate, Date lastUpdate, AddressDto address) {
        this.id = id;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StoreDto getStore() {
        return store;
    }

    public void setStore(StoreDto store) {
        this.store = store;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
