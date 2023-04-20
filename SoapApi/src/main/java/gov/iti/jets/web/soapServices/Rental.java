package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.RentalDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.services.RentalService;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Rental {
    private RentalService rentalService;

    public Rental() {
        rentalService = new RentalService();
    }

    public List<RentalDto> getAllRentals() {
        return rentalService.getAllRentals();
    }

    public RentalDto getRentalById(int id) {
        return rentalService.getRentalById(id);
    }

    public void addRental(RentalDto rentalDto) {
        rentalService.addRental(rentalDto);
    }

    public void updateRental(RentalDto rentalDto) {
        rentalService.updateRental(rentalDto);
    }

    public RentalInventoryDto getInventoryByRental(int id) {
        return rentalService.getInventoryByRental(id);
    }

    public RentalStaffDto getStaffByRental (int id) {
        return rentalService.getStaffByRental(id) ;
    }

    public CustomerDto getCustomerByRental(int id) {
        return rentalService.getCustomerByRental(id);
    }
}
