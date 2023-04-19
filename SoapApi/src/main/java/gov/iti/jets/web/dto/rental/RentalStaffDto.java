package gov.iti.jets.web.dto.rental;

import java.io.Serializable;

public class RentalStaffDto implements Serializable {
    private Short id;
    private String firstName;
    private String lastName;

    public RentalStaffDto() {
    }

    public RentalStaffDto(Short id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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
}
