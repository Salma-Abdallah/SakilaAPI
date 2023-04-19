package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.InventoryDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.mapper.FilmMapper;
import gov.iti.jets.web.mapper.InventoryMapper;
import gov.iti.jets.web.mapper.StoreMapper;
import gov.iti.jets.web.mapper.rental.RentalInventoryMapper;
import gov.iti.jets.web.persistence.daos.implementation.InventoryDaoImplement;
import gov.iti.jets.web.persistence.entity.Inventory;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.*;

public class InventoryService {
    private InventoryDaoImplement inventoryDao;
    private InventoryMapper mapper;
    public InventoryService() {
        inventoryDao = new InventoryDaoImplement();
        mapper = Mappers.getMapper(InventoryMapper.class);
    }

    public List<InventoryDto> getAllInventories() {
        List<Inventory> inventories = inventoryDao.getAll();
        List<InventoryDto> inventoryDtos = new ArrayList<>();
        for (Inventory s : inventories) {
            inventoryDtos.add(mapper.toDto(s));
        }
        return inventoryDtos;
    }

    public RentalInventoryDto getInventoryById(int id) {
        RentalInventoryMapper rentalInventoryMapper = Mappers.getMapper(RentalInventoryMapper.class);
        Inventory inventory = inventoryDao.getById(Inventory.class , id);
        return rentalInventoryMapper.toDto(inventory);
    }

    public void addPayment(InventoryDto inventoryDto){

        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        inventoryDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Inventory inventory = mapper.toEntity(inventoryDto);
        inventoryDao.add(inventory);
    }

    public void updatePayment(InventoryDto inventoryDto) {
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        inventoryDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

        Inventory inventory = mapper.toEntity(inventoryDto);
        inventoryDao.update(inventory);
    }

    public FilmDto getFilmByInventoryId(int id) {
        FilmMapper filmMapper = Mappers.getMapper(FilmMapper.class);
        return filmMapper.toDto(inventoryDao.getFilmByInventoryId(id));
    }

    public StoreDto getStoreByInventoryId(int id){
        StoreMapper storeMapper = Mappers.getMapper(StoreMapper.class);
        return storeMapper.toDto(inventoryDao.getStoreByInventoryId(id));
    }
}
