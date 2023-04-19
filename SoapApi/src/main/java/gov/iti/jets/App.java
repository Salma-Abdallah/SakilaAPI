package gov.iti.jets;


import gov.iti.jets.web.persistence.daos.implementation.ActorDaoImplement;
import gov.iti.jets.web.persistence.daos.implementation.CategoryDaoImplement;
import gov.iti.jets.web.persistence.daos.implementation.StaffDaoImplement;
import gov.iti.jets.web.persistence.entity.Film;
import gov.iti.jets.web.services.AddressServices;

import java.util.List;

public class App {
    public static void main( String[] args )
    {
        AddressServices a = new AddressServices();
        a.getAddressById(1);
    }
    
}
