package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CityDto;
import gov.iti.jets.web.services.CityService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class City {
    private CityService cityService;

    public City() {
        cityService = new CityService();
    }

    @WebResult(name="Cities")
    public List<CityDto> getAllCities() {
        return cityService.getAllCities();
    }

    @WebResult(name="City")
    public CityDto getCityById(@WebParam(name = "id") int id) {
        return cityService.getCityById(id);
    }

    public void addCity(@WebParam(name="city") CityDto cityDto) {
        cityService.addCity(cityDto);
    }

    public void updateCity(@WebParam(name="city") CityDto cityDto) {
        cityService.updateCity(cityDto);
    }

    @WebResult(name="Cities")
    public CityDto getCityByName(@WebParam(name = "name") String name) {
        return cityService.getCityByName(name);
    }
}
