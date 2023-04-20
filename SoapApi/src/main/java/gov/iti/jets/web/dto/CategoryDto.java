package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Data
public class CategoryDto implements Serializable {
    private Short id;
    private String name;
    private Instant lastUpdate;

    public CategoryDto() {
    }

    public CategoryDto(Short id, String name, Instant lastUpdate) {
        this.id = id;
        this.name = name;
        this.lastUpdate = lastUpdate;

    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        CategoryDto that = (CategoryDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastUpdate);
    }
}
