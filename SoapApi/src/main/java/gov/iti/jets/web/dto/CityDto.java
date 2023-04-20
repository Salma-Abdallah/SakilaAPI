package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Data
public class CityDto implements Serializable {
    private Integer id;
    private String city;
    private CountryDto country;
    private Instant lastUpdate;

    public CityDto() {
    }

    public CityDto(Integer id, String city, CountryDto country, Instant lastUpdate) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
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
        CityDto cityDto = (CityDto) o;
        return Objects.equals(id, cityDto.id) && Objects.equals(city, cityDto.city) && Objects.equals(country, cityDto.country) && Objects.equals(lastUpdate, cityDto.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, country, lastUpdate);
    }
}
