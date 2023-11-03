package zoomcar.models;

import java.time.Instant;
import java.util.List;

import zoomcar.models.addOns.AddOns;
import zoomcar.models.payments.Payment;
import zoomcar.models.vehicle.Vehicle;

public class Booking {
    private Vehicle vehicle;
    private User user;
    private long startTime;
    private long endTime;
    private Payment payment;
    private List<AddOns> addOns;

    public double getPrice () {
        //uses decorator pattern to calculate price
        return 0.0;
    }

    //getters and setters
}
