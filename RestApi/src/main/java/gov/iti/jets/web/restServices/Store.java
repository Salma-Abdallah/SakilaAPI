package gov.iti.jets.web.restServices;


import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.StoreUpdateDto;
import gov.iti.jets.web.services.StoreService;

import java.util.List;


public class Store {
    private StoreService storeService;

    public Store() {
        storeService = new StoreService();
    }

    public List<StoreDto> getAllStores() {
        return storeService.getAllStores();
    }

    public StoreDto getStoreById(int id) {
        return storeService.getStoreById(id);
    }

    public void addStore(StoreUpdateDto storeDto) {
        storeService.addStore(storeDto);
    }
}
