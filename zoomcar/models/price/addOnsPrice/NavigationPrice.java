package zoomcar.models.price.addOnsPrice;

import zoomcar.models.price.Price;
import zoomcar.models.price.priceDecorator.DecoratorPrice;
import zoomcar.models.price.priceStrategy.PriceStrategy;

public class NavigationPrice extends DecoratorPrice{
    double amount = 10;
    public NavigationPrice(PriceStrategy priceStrategy, Price price, double amount) {
        super(priceStrategy, price, amount);
    }
    
}