package zoomcar.models.price.priceStrategy;

public class HourPriceStrategy implements PriceStrategy{
    @Override
    public double calculatePrice(int interval, double amount) {
        return amount*interval;
    }
    
}
