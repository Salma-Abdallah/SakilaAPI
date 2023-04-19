package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
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
}