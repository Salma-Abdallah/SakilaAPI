package gov.iti.jets.web.soapServices;

import gov.iti.jets.web.dto.CustomerDto;
import gov.iti.jets.web.dto.RentalDto;
import gov.iti.jets.web.dto.rental.RentalInventoryDto;
import gov.iti.jets.web.dto.rental.RentalStaffDto;
import gov.iti.jets.web.services.RentalService;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class Rental {
    private RentalService rentalService;

    public Rental() {
        rentalService = new RentalService();
    }

    @WebResult(name="Rentals")
    public List<RentalDto> getAllRentals() {
        return rentalService.getAllRentals();
    }

    @WebResult(name="Rental")
    public RentalDto getRentalById(@WebParam(name = "id") int id) {
        return rentalService.getRentalById(id);
    }

    public void addRental(@WebParam(name = "rental") RentalDto rentalDto) {
        rentalService.addRental(rentalDto);
    }

    public void updateRental(@WebParam(name = "rental") RentalDto rentalDto) {
        rentalService.updateRental(rentalDto);
    }

    @WebResult(name="Inventory")
    public RentalInventoryDto getInventoryByRental(@WebParam(name = "id") int id) {
        return rentalService.getInventoryByRental(id);
    }

    @WebResult(name="Staff")
    public RentalStaffDto getStaffByRental (@WebParam(name = "id") int id) {
        return rentalService.getStaffByRental(id) ;
    }

    @WebResult(name="Customer")
    public CustomerDto getCustomerByRental(@WebParam(name = "id") int id) {
        return rentalService.getCustomerByRental(id);
    }
}
