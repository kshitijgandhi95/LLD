package zoomcar.models.vehicle;

import zoomcar.models.Booking;
import zoomcar.models.Location;
import zoomcar.models.addOns.AddOns;
import zoomcar.models.price.Price;

public interface Vehicle {
    public Booking bookVehicle ();
    public Location getLocation();
    public Booking getBooking();
    public Price getPrice();
}