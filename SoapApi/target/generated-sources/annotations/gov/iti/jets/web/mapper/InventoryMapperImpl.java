package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.InventoryDto;
import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.persistence.entity.Inventory;
import gov.iti.jets.web.persistence.entity.Store;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T13:26:04+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public Inventory toEntity(InventoryDto inventoryDto) {
        if ( inventoryDto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setStore( inventoryDtoToStore( inventoryDto ) );
        inventory.setFilm( inventoryDtoToFilm( inventoryDto ) );
        inventory.setId( inventoryDto.getId() );
        inventory.setLastUpdate( inventoryDto.getLastUpdate() );

        return inventory;
    }

    @Override
    public InventoryDto toDto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        InventoryDto inventoryDto = new InventoryDto();

        Short id = inventoryStoreId( inventory );
        if ( id != null ) {
            inventoryDto.setStoreId( id.intValue() );
        }
        inventoryDto.setFilmId( inventoryFilmId( inventory ) );
        inventoryDto.setId( inventory.getId() );
        inventoryDto.setLastUpdate( inventory.getLastUpdate() );

        return inventoryDto;
    }

    @Override
    public Inventory partialUpdate(InventoryDto inventoryDto, Inventory inventory) {
        if ( inventoryDto == null ) {
            return inventory;
        }

        if ( inventory.getStore() == null ) {
            inventory.setStore( new Store() );
        }
        inventoryDtoToStore1( inventoryDto, inventory.getStore() );
        if ( inventory.getFilm() == null ) {
            inventory.setFilm( new Film() );
        }
        inventoryDtoToFilm1( inventoryDto, inventory.getFilm() );
        if ( inventoryDto.getId() != null ) {
            inventory.setId( inventoryDto.getId() );
        }
        if ( inventoryDto.getLastUpdate() != null ) {
            inventory.setLastUpdate( inventoryDto.getLastUpdate() );
        }

        return inventory;
    }

    protected Store inventoryDtoToStore(InventoryDto inventoryDto) {
        if ( inventoryDto == null ) {
            return null;
        }

        Store store = new Store();

        if ( inventoryDto.getStoreId() != null ) {
            store.setId( inventoryDto.getStoreId().shortValue() );
        }

        return store;
    }

    protected Film inventoryDtoToFilm(InventoryDto inventoryDto) {
        if ( inventoryDto == null ) {
            return null;
        }

        Film film = new Film();

        film.setId( inventoryDto.getFilmId() );

        return film;
    }

    private Short inventoryStoreId(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }
        Store store = inventory.getStore();
        if ( store == null ) {
            return null;
        }
        Short id = store.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer inventoryFilmId(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }
        Film film = inventory.getFilm();
        if ( film == null ) {
            return null;
        }
        Integer id = film.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void inventoryDtoToStore1(InventoryDto inventoryDto, Store mappingTarget) {
        if ( inventoryDto == null ) {
            return;
        }

        if ( inventoryDto.getStoreId() != null ) {
            mappingTarget.setId( inventoryDto.getStoreId().shortValue() );
        }
    }

    protected void inventoryDtoToFilm1(InventoryDto inventoryDto, Film mappingTarget) {
        if ( inventoryDto == null ) {
            return;
        }

        if ( inventoryDto.getFilmId() != null ) {
            mappingTarget.setId( inventoryDto.getFilmId() );
        }
    }
}
