package gov.iti.jets.web.dto.rental;

import java.io.Serializable;

public class RentalInventoryDto implements Serializable {
    private Integer id;
    private RentalFilmDto film;
    private Short storeId;
}
