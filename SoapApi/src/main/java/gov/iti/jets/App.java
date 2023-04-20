package gov.iti.jets;


import gov.iti.jets.web.persistence.daos.implementation.*;
import gov.iti.jets.web.services.ActorServices;

import java.util.List;

public class App {
    public static void main( String[] args )
    {
        ActorServices actorServices = new ActorServices();
        System.out.println(actorServices.getAllActors().toString());
    }
    
}
