package zoomcar.models.price.VehiclePrice;

import zoomcar.models.price.priceDecorator.BasePrice;
import zoomcar.models.price.priceStrategy.PriceStrategy;

public class FourWheelerPrice extends BasePrice{

    public FourWheelerPrice(PriceStrategy priceStrategy, double amount) {
        super(priceStrategy, amount);
    }
    
}
