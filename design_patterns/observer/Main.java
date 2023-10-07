package observer;

public class Main {
    public static void main (String [] args ) {
        Observerable pObv = new ProductObservable();
        Observer pObs = new ProductObserver(pObv);
        pObv.add(pObs);
        pObv.setData(10);
    }
}
