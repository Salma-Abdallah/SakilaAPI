package gov.iti.jets.web.soapServices;


import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.services.LanguageService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Language {
    private LanguageService languageService;

    public Language() {
        languageService = new LanguageService();
    }

    @WebResult(name = "Languages")
    public List<LanguageDto> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @WebResult(name = "Language")
    public LanguageDto getLanguageById(@WebParam(name = "id") int id) {
        return languageService.getLanguageById(id);
    }

    @WebResult(name = "Language")
    public LanguageDto getFilmLanguageById(@WebParam(name = "id") int id) {
        return languageService.getFilmLanguageById(id);
    }
}
