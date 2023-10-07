package observer;

import java.util.ArrayList;

public class ProductObservable implements Observerable{
    ArrayList <Observer> obs;
    //Product, item definitons
    int quantity = 0;
    ProductObservable () {
        this.obs = new ArrayList<Observer> ();
    }

    @Override
    public void add(Observer obs) {
        this.obs.add (obs);
    }

    @Override
    public void remove(Observer obs) {
        
    }

    @Override
    public void notifyObservers() {
        for (int i=0; i<this.obs.size(); i++) {
            Observer ob = obs.get(i);
            ob.publishNotification ();
        }
    }

    @Override
    public void setData(int quantity) {
        this.quantity = quantity;
        if (this.quantity > 0) {
            this.notifyObservers();
        }
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }
    
    
}
