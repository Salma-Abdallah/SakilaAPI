package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.InventoryDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.services.InventoryService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Inventory {
    private InventoryService inventoryService;

    public Inventory() {
        inventoryService = new InventoryService();
    }

    public List<InventoryDto> getAllInventories() {
        return inventoryService.getAllInventories();
    }

    public RentalInventoryDto getInventoryById(int id) {
        return inventoryService.getInventoryById(id);
    }

    public void addPayment(InventoryDto inventoryDto) {
        inventoryService.addPayment(inventoryDto);
    }

    public void updatePayment(InventoryDto inventoryDto) {
        inventoryService.updatePayment(inventoryDto);
    }

    public FilmDto getFilmByInventoryId(int id) {
        return inventoryService.getFilmByInventoryId(id);
    }

    public StoreDto getStoreByInventoryId(int id) {
        return inventoryService.getStoreByInventoryId(id);
    }
}
