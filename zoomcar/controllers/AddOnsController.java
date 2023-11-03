package zoomcar.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import zoomcar.Enums.Vehicle;
import zoomcar.models.addOns.AddOns;

public class AddOnsController {
    private Map<Vehicle, List<AddOns>> addOns;
    
    AddOnsController (Map<Vehicle, List<AddOns>> addOns) {
        this.addOns = addOns;
    }

    public List<AddOns> getAddOnsByVehicleType (Vehicle v) {
        if (addOns.containsKey(v)) {
            return addOns.get(v);
        }
        return new ArrayList<AddOns>();
    }
}
