package gov.iti.jets.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Data
public class InventoryDto implements Serializable {
    private Integer id;
    private Integer filmId;
    private Integer storeId;
    private Instant lastUpdate;

    public InventoryDto() {
    }

    public InventoryDto(Integer id, Integer filmId, Integer storeId, Instant lastUpdate) {
        this.id = id;
        this.filmId = filmId;
        this.storeId = storeId;
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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
        InventoryDto that = (InventoryDto) o;
        return Objects.equals(id, that.id) && Objects.equals(filmId, that.filmId) && Objects.equals(storeId, that.storeId) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filmId, storeId, lastUpdate);
    }
}
