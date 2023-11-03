package zoomcar.models.price.priceDecorator;

import zoomcar.models.price.Price;
import zoomcar.models.price.priceStrategy.PriceStrategy;

public abstract class DecoratorPrice implements Price {
    private double amount;
    private Price price;
    private PriceStrategy priceStrategy;

    public DecoratorPrice (PriceStrategy priceStrategy, Price price, double amount) {
        this.amount = amount;
        this.price = price;
        this.priceStrategy = priceStrategy;
    }

    @Override
    public double getPrice(int interval) {
        return price.getPrice(interval) + priceStrategy.calculatePrice(interval, amount);
    }    
}