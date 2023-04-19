package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.mapper.ActorMapper;
import gov.iti.jets.web.mapper.CategoryMapper;
import gov.iti.jets.web.mapper.FilmMapper;
import gov.iti.jets.web.mapper.StoreMapper;
import gov.iti.jets.web.persistence.daos.implementation.FilmDaoImplement;
import gov.iti.jets.web.persistence.entity.*;
import org.mapstruct.factory.Mappers;

import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmService {
    private FilmDaoImplement filmDao;
    private FilmMapper mapper;

    public FilmService() {
        filmDao = new FilmDaoImplement();
        mapper = Mappers.getMapper(FilmMapper.class);
    }

    public List<FilmDto> getAllFilms() {
        List<Film> films = filmDao.getAll();
        List<FilmDto> filmDtos = new ArrayList<>();
        for (Film film : films) {
            filmDtos.add(mapper.toDto(film));
        }
        return filmDtos;
    }

    public FilmDto getFilmById(int id) {
        Film film = filmDao.getById(Film.class , id);
        return mapper.toDto(film);
    }

    public void add(FilmDto filmDto) {
        FilmMapper mapper = Mappers.getMapper(FilmMapper.class);
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        filmDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Film film = mapper.toEntity(filmDto);
        filmDao.add(film);
    }

    public void update(FilmDto filmDto) {

        FilmMapper mapper = Mappers.getMapper(FilmMapper.class);
        LocalDate localDate = LocalDate.now();
        ZoneId defaultZoneId = ZoneId.systemDefault();
        filmDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());
        Film film = mapper.toEntity(filmDto);
        filmDao.update(film);
    }
    public List<ActorDto> getFilmActorsById(int id) {
        ActorMapper actorMapper = Mappers.getMapper(ActorMapper.class);
        List<Actor> actors = filmDao.getFilmActors(id);
        List<ActorDto> actorDtos = new ArrayList<>();

        for(Actor actor:actors) {
            actorDtos.add(actorMapper.toDto(actor));
        }

        return actorDtos;
    }

    public List<CategoryDto> getFilmCategoryById(int id) {
        CategoryMapper categoryMapper = Mappers.getMapper(CategoryMapper.class);
        List<Category> categories = filmDao.getFilmCategory(id);
        List<CategoryDto> categoryDtos = new ArrayList<>();
        for(Category category:categories) {
            categoryDtos.add(categoryMapper.toDto(category));
        }

        return categoryDtos;
    }

    public List<StoreDto> getFilmStores(int id) {

        StoreMapper storeMapper = Mappers.getMapper(StoreMapper.class);
        List<Store> stores = filmDao.getFilmStores(id);
        List<StoreDto> storeDto = new ArrayList<>();
        for (Store s : stores) {
            storeDto.add(storeMapper.toDto(s));
        }
        return storeDto;
    }

    public Language getFilmLanguagebyId(int id) {
        return filmDao.getFilmLanguage(id);
    }

    public Long getNumberOfFilmsInInventory(int id) {

        return filmDao.getNumberOfFilmsInInventory(id);
    }

}
