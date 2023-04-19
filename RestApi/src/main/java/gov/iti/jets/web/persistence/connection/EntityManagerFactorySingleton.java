package gov.iti.jets.web.persistence.connection;

import jakarta.persistence.*;
import jakarta.persistence.EntityManagerFactory;

public class EntityManagerFactorySingleton {
    private static EntityManagerFactory instance;
    
    private EntityManagerFactorySingleton() {}

    public static EntityManagerFactory getInstance(){

        if(instance==null) {
            synchronized (EntityManagerFactorySingleton.class) {
                if(instance ==null){
                    instance = Persistence.createEntityManagerFactory("sakila");
                }
            }
        }
        return instance;
    }

    public static EntityManager getEntityManager(){
        return getInstance().createEntityManager();
    }

    public static void close(){
        if(instance!=null) {
            instance.close();
            instance=null;
        }
    }
}
