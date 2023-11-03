package zoomcar.models.addOns;

import zoomcar.models.price.Price;

public class AddOns {
    private String name;
    private Price price;

    AddOns (String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public Price getPrice () {
        return this.price;
    }
}
