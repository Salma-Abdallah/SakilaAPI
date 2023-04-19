package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.services.CountryService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Country {
    private CountryService countryService;

    public Country() {
        countryService = new CountryService();
    }

    public List<CountryDto> getAllCountries() {
        return countryService.getAllCountries();
    }

    public CountryDto getCountryById(int id) {
        return countryService.getCountryById(id);
    }

    public void addCountry(CountryDto countryDto) {
        countryService.addCountry(countryDto);
    }

    public void updateCountry(CountryDto countryDto) {
        countryService.updateCountry(countryDto);
    }

    public CountryDto getCountryByName(String name) {
        return countryService.getCountryByName(name);
    }
}
