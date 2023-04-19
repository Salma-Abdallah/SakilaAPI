package gov.iti.jets.web.dto.rental;

import java.io.Serializable;

public class RentalFilmDto implements Serializable {
    private Integer id;
    private String title;

    public RentalFilmDto() {
    }

    public RentalFilmDto(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
