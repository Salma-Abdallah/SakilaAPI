package gov.iti.jets.web.persistence.daos.implementation;

import gov.iti.jets.web.persistence.daos.interfaces.LanguageDao;
import gov.iti.jets.web.persistence.entity.Language;
import jakarta.persistence.Query;

public class LanguageDaoImplement extends BaseDaoImplement<Language , Integer>  implements LanguageDao {


    @Override
    public Language getFilmLanguage(int id) {
        String query=" from Actor a where a.language.id=?1";
        Query q=entityManager.createQuery(query)
                .setParameter(1, id);
        Language language = (Language) q.getSingleResult();

        return language;
    }
}
