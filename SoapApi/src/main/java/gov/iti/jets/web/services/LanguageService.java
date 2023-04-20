package gov.iti.jets.web.services;

import gov.iti.jets.web.dto.LanguageDto;
import gov.iti.jets.web.mapper.LanguageMapper;
import gov.iti.jets.web.persistence.daos.implementation.LanguageDaoImplement;
import gov.iti.jets.web.persistence.entity.Language;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
public class LanguageService {
    private LanguageDaoImplement languageDao;
    private LanguageMapper mapper;

    public LanguageService() {
        languageDao = new LanguageDaoImplement();
        mapper= Mappers.getMapper(LanguageMapper.class);
    }

    public List<LanguageDto> getAllLanguages(){
        List<Language> languages = languageDao.getAll();
        List<LanguageDto> languageDtos = new ArrayList<>();

        for(Language language : languages) {

            languageDtos.add(mapper.toDto(language));
        }

        return languageDtos;
    }

    public LanguageDto getLanguageById(int id) {
        Language language = languageDao.getById(Language.class,id);
        return mapper.toDto(language);
    }

    // public void addLanguage(LanguageDto languageDto) {
    //     LocalDate localDate = LocalDate.now();
    //     ZoneId defaultZoneId = ZoneId.systemDefault();
    //     languageDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

    //     Language language =mapper.toEntity(languageDto);
    //     languageDao.add(language);

    // }

    // public void updateLanguage(LanguageDto languageDto) {
    //     LocalDate localDate = LocalDate.now();
    //     ZoneId defaultZoneId = ZoneId.systemDefault();
    //     languageDto.setLastUpdate(Date.from(localDate.atStartOfDay(defaultZoneId).toInstant()).toInstant());

    //     Language language =mapper.toEntity(languageDto);
    //     languageDao.update(language);

    // }

    public LanguageDto getFilmLanguageById(int id) {
        Language language = languageDao.getFilmLanguage(id);
        return mapper.toDto(language);
    }
}
