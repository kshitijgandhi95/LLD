package zoomcar.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import zoomcar.models.Store;
import zoomcar.models.vehicle.Vehicle;

public class VehicleController {
    private Map<Store, List<Vehicle>> map;

    public List<Vehicle> getVehicles (Store s) {
        if (map.containsKey(s)) {
            return map.get(s);
        }
        return new ArrayList<Vehicle>();
    }
}