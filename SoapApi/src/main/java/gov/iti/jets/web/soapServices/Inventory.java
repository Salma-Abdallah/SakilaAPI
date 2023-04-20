package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.InventoryDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.services.InventoryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Inventory {
    private InventoryService inventoryService;

    public Inventory() {
        inventoryService = new InventoryService();
    }

    @WebResult(name = "inventories")
    public List<InventoryDto> getAllInventories() {
        return inventoryService.getAllInventories();
    }

    @WebResult(name = "inventory")
    public RentalInventoryDto getInventoryById(@WebParam(name = "id") int id) {
        return inventoryService.getInventoryById(id);
    }

    public void addPayment(@WebParam(name = "inventory") InventoryDto inventoryDto) {
        inventoryService.addPayment(inventoryDto);
    }

    public void updatePayment(@WebParam(name = "inventory") InventoryDto inventoryDto) {
        inventoryService.updatePayment(inventoryDto);
    }

    @WebResult(name = "Film")
    public FilmDto getFilmByInventoryId(@WebParam(name = "id") int id) {
        return inventoryService.getFilmByInventoryId(id);
    }

    @WebResult(name = "Store")
    public StoreDto getStoreByInventoryId(@WebParam(name = "id") int id) {
        return inventoryService.getStoreByInventoryId(id);
    }
}
