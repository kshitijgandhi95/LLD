package zoomcar.models.price.VehiclePrice;

import zoomcar.models.price.priceDecorator.BasePrice;
import zoomcar.models.price.priceStrategy.PriceStrategy;

public class TwoWheelerPrice extends BasePrice {

    public TwoWheelerPrice(PriceStrategy priceStrategy, double amount) {
        super(priceStrategy, amount);
    }
    
}
