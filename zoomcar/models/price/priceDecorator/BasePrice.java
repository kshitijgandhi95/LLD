package zoomcar.models.price.priceDecorator;

import zoomcar.models.price.Price;
import zoomcar.models.price.priceStrategy.PriceStrategy;

public abstract class BasePrice implements Price {
    private double amount;
    private PriceStrategy priceStrategy;
    
    public BasePrice (PriceStrategy priceStrategy, double amount) {
        this.amount = amount;
        this.priceStrategy = priceStrategy;
    }

    @Override
    public double getPrice(int interval) {
        return priceStrategy.calculatePrice(interval, amount);
    }
    
}
