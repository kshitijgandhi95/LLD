package zoomcar.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import zoomcar.Enums.City;
import zoomcar.models.Store;

public class StoreController {
   private Map<City, List<Store>> map;
    
   StoreController(Map<City, List<Store>> map) {
    this.map = map;
   }

   public List<Store> getStore (City city) {
        if (map.containsKey(city)) {
            return map.get(city);
        }
        return new ArrayList<Store>();
   }
}
