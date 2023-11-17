package BarberShopProblem;

public class Customer implements Runnable{
    private String name;
    private Barber barber;

    Customer (String name, Barber barber) {
        this.name = name;
        this.barber = barber;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        try {
            // System.out.println("Going to barber shop " + this.getName());
            Thread.sleep (1000);
            barber.addCustomer(this);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
