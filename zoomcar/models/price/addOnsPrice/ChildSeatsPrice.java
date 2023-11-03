package zoomcar.models.price.addOnsPrice;

import zoomcar.models.price.Price;
import zoomcar.models.price.priceDecorator.DecoratorPrice;
import zoomcar.models.price.priceStrategy.PriceStrategy;

public class ChildSeatsPrice extends DecoratorPrice{
    double amount = 20;
    ChildSeatsPrice(PriceStrategy priceStrategy, Price price, double amount) {
        super(priceStrategy, price, amount);
    }
    
}