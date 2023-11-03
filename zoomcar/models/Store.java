package zoomcar.models;

import java.util.List;
import zoomcar.models.vehicle.Vehicle;

public class Store {
    private List<Vehicle> vehicles;
    private Location location;

    public Store (List<Vehicle> vehicles, Location location) {
        this.vehicles = vehicles;
        this.location = location;
    }

    public List<Vehicle> getVehicles () {
        return this.vehicles;
    }

    public Location geLocation () {
        return this.location;
    }
}