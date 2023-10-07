package observer;

public class ProductObserver implements Observer{
    Observerable obv;
    //Product p, User u definitions
    
    ProductObserver (Observerable obv) {
        this.obv = obv;
    }

    @Override
    public void publishNotification() {
        System.out.println(obv.getQuantity() + " Avaibale for this product");
    }
    
}
