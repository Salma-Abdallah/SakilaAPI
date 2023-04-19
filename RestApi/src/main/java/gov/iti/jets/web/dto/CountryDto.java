package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
public class CountryDto implements Serializable {
    private Integer id;
    private String country;
    private Instant lastUpdate;

    public CountryDto() {
    }

    public CountryDto(Integer id, String country, Instant lastUpdate) {
        this.id = id;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
