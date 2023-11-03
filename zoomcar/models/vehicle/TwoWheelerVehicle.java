package zoomcar.models.vehicle;

import zoomcar.models.Booking;
import zoomcar.models.Location;
import zoomcar.models.addOns.AddOns;
import zoomcar.models.price.Price;

import java.util.List;

import zoomcar.Enums.Vehicle;

public class TwoWheelerVehicle implements zoomcar.models.vehicle.Vehicle{
    private String vehicleNo;
    private zoomcar.Enums.Vehicle vehicleType;
    private Price price;
    private List<AddOns> addOns;
    private Booking booking;
    
    TwoWheelerVehicle (String vehicleNo,  zoomcar.Enums.Vehicle vehicleType, Price price) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.price = price;
    }

    @Override
    public Booking bookVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bookVehicle'");
    }

    @Override
    public Location getLocation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLocation'");
    }

    @Override
    public Booking getBooking() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBooking'");
    }

    @Override
    public Price getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}
