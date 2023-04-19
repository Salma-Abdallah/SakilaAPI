package gov.iti.jets.web.dto.rental;

import java.io.Serializable;

public class RentalCustomerDto implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;

    public RentalCustomerDto() {
    }

    public RentalCustomerDto(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
