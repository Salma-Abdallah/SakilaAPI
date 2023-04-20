package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link gov.iti.jets.web.persistence.entity.Language} entity
 */
@Data
public class LanguageDto implements Serializable {
    private Short id;
    private String name;
    private Instant lastUpdate;
    private Set<FilmDto> films;

    public LanguageDto() {
    }

    public LanguageDto(Short id, String name, Instant lastUpdate, Set<FilmDto> films) {
        this.id = id;
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.films = films;
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

    public Set<FilmDto> getFilms() {
        return films;
    }

    public void setFilms(Set<FilmDto> films) {
        this.films = films;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageDto that = (LanguageDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(lastUpdate, that.lastUpdate) && Objects.equals(films, that.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastUpdate, films);
    }


}