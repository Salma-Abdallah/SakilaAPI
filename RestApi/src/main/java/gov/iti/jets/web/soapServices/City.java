package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CityDto;
import gov.iti.jets.web.services.CityService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class City {
    private CityService cityService;

    public City() {
        cityService = new CityService();
    }

    public List<CityDto> getAllCities() {
        return cityService.getAllCities();
    }

    public CityDto getCityById(int id) {
        return cityService.getCityById(id);
    }

    public void addCity(CityDto cityDto) {
        cityService.addCity(cityDto);
    }

    public void updateCity(CityDto cityDto) {
        cityService.updateCity(cityDto);
    }

    public CityDto getCityByName(String name) {
        return cityService.getCityByName(name);
    }
}
