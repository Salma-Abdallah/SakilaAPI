package gov.iti.jets.web.soapServices;


import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.services.LanguageService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Language {
    private LanguageService languageService;

    public Language() {
        languageService = new LanguageService();
    }
    public List<LanguageDto> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    public LanguageDto getLanguageById(int id) {
        return languageService.getLanguageById(id);
    }

    public LanguageDto getFilmLanguageById(int id) {
        return languageService.getFilmLanguageById(id);
    }
}
