package observer;

public interface Observerable {
    public void add (Observer obs);
    public void remove (Observer obs);
    public void notifyObservers();
    public void setData(int quantity);
    public int getQuantity ();

}
