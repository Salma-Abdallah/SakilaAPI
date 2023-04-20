package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryDto that = (CountryDto) o;
        return Objects.equals(id, that.id) && Objects.equals(country, that.country) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, lastUpdate);
    }
}
