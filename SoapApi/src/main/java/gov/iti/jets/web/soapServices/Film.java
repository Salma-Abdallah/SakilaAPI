package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.dto.CategoryDto;
import gov.iti.jets.web.dto.FilmDto;
import gov.iti.jets.web.dto.StoreDto;
import gov.iti.jets.web.persistence.entity.Language;
import gov.iti.jets.web.services.FilmService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Film {
    private FilmService filmService;

    public Film() {
        filmService= new FilmService();
    }

    @WebResult(name="Films")
    public List<FilmDto> getAllFilms() {
        return filmService.getAllFilms();
    }

    @WebResult(name="Film")
    public FilmDto getFilmById(@WebParam(name = "id") int id) {
        return filmService.getFilmById(id);
    }

    public void add(@WebParam(name = "Film") FilmDto filmDto) {
        filmService.add(filmDto);
    }

    public void update(@WebParam(name = "Film")FilmDto filmDto) {
        filmService.update(filmDto);
    }

    @WebResult(name="Actors")
    public List<ActorDto> getFilmActorsById(@WebParam(name = "id") int id) {
        return filmService.getFilmActorsById(id);
    }

    @WebResult(name="Categories")
    public List<CategoryDto> getFilmCategoryById(@WebParam(name = "id") int id) {
        return filmService.getFilmCategoryById(id);
    }

    @WebResult(name="Stores")
    public List<StoreDto> getFilmStores(@WebParam(name = "id") int id) {
        return filmService.getFilmStores(id);
    }

    @WebResult(name="Language")
    public Language getFilmLanguageById(@WebParam(name = "id") int id) {
        return filmService.getFilmLanguagebyId(id);
    }

    @WebResult(name="NumberOfFilms")
    public Long getNumberOfFilmsInInventory(@WebParam(name = "id") int id) {
        return filmService.getNumberOfFilmsInInventory(id);
    }
}
