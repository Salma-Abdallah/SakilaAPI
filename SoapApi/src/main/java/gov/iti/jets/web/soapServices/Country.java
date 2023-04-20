package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CountryDto;
import gov.iti.jets.web.services.CountryService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Country {
    private CountryService countryService;

    public Country() {
        countryService = new CountryService();
    }

    @WebResult(name = "Countries")
    public List<CountryDto> getAllCountries() {
        return countryService.getAllCountries();
    }

    @WebResult(name = "Country")
    public CountryDto getCountryById(@WebParam(name="id") int id) {
        return countryService.getCountryById(id);
    }

    public void addCountry(@WebParam(name="country") CountryDto countryDto) {
        countryService.addCountry(countryDto);
    }

    public void updateCountry(@WebParam(name="country") CountryDto countryDto) {
        countryService.updateCountry(countryDto);
    }

    @WebResult(name = "Country")
    public CountryDto getCountryByName(@WebParam(name="name") String name) {
        return countryService.getCountryByName(name);
    }
}
