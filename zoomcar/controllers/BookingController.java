package zoomcar.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import zoomcar.models.Booking;
import zoomcar.models.User;
import zoomcar.models.vehicle.Vehicle;

public class BookingController {
    private Map<User, List<Booking>> userVsBooking;
    private Map<Vehicle, List<Booking>> vehicleVsBooking;
    
    public List<Booking> getUserBookings (User u) {
        if (userVsBooking.containsKey(u)) {
            return userVsBooking.get(u);
        }
        return new ArrayList<Booking>();
    }

    public List<Vehicle> getUnbookedVehicles (List<Vehicle> vehicles) {
        //logic to use vehicleVsBooking to get unbooked vehicles
        return vehicles;
    }

}
