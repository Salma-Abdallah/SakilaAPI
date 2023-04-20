package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.persistence.entity.Language;
import gov.iti.jets.web.services.FilmService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Film {
    private FilmService filmService;

    public Film() {
        filmService= new FilmService();
    }

    public List<FilmDto> getAllFilms() {
        return filmService.getAllFilms();
    }

    public FilmDto getFilmById(int id) {
        return filmService.getFilmById(id);
    }

    public void add(FilmDto filmDto) {
        filmService.add(filmDto);
    }

    public void update(FilmDto filmDto) {
        filmService.update(filmDto);
    }

    public List<ActorDto> getFilmActorsById(int id) {
        return filmService.getFilmActorsById(id);
    }

    public List<CategoryDto> getFilmCategoryById(int id) {
        return filmService.getFilmCategoryById(id);
    }

    public List<StoreDto> getFilmStores(int id) {
        return filmService.getFilmStores(id);
    }

    public Language getFilmLanguagebyId(int id) {
        return filmService.getFilmLanguagebyId(id);
    }

    public Long getNumberOfFilmsInInventory(int id) {
        return filmService.getNumberOfFilmsInInventory(id);
    }
}
