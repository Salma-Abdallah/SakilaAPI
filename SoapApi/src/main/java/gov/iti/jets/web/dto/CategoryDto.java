package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

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
}
