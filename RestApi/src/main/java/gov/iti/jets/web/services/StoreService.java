package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.dto.StoreUpdateDto;
import gov.iti.jets.web.mapper.StoreMapper;
import gov.iti.jets.web.mapper.StoreUpdateMapper;
import gov.iti.jets.web.persistence.daos.implementation.StoreDaoImplement;
import gov.iti.jets.web.persistence.entity.Store;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.*;

public class StoreService {
    private StoreDaoImplement storeDao;
    private StoreMapper mapper;


    public StoreService() {
        storeDao = new StoreDaoImplement();
        mapper = Mappers.getMapper(StoreMapper.class);
    }

    public List<StoreDto> getAllStores() {
        List<Store> stores = storeDao.getAll();
        List<StoreDto> storeDtos = new ArrayList<>();
        for (Store s : stores) {
            storeDtos.add(mapper.toDto(s));
        }
        return storeDtos;
    }

    public StoreDto getStoreById(int id) {
        Store store = storeDao.getById(Store.class,id);
        return mapper.toDto(store);
    }

    public void addStore(StoreUpdateDto storeDto){
        StoreUpdateMapper storeEditMapper = Mappers.getMapper(StoreUpdateMapper.class);
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();

        Store store = storeEditMapper.toEntity(storeDto);
        storeDao.add(store);
    }
}
