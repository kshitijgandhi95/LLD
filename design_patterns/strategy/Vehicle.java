package strategy;

public class Vehicle {
    public Drive d;
    Vehicle (Drive d) {
        this.d = d;
    };

    public void drive () {
        d.drive();
    }
}