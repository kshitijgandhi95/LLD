package BarberShopProblem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Barber implements Runnable {
    private int waitingSeats;
    private final BlockingQueue<Customer> waitingQueue = new LinkedBlockingQueue<Customer>();
    private boolean isSleeping;

    public Barber (int waitingSeats) {
        this.waitingSeats = waitingSeats;
        this.isSleeping = true;
    }

    public void addCustomer (Customer customer) {
        if (waitingQueue.size() >= waitingSeats) {
            System.out.println("Customer is leaving because shop is full "+ customer.getName());
            return;
        }
        waitingQueue.add(customer);
        System.out.println("Customer enters shop "+ customer.getName());
        if (isSleeping) {
            isSleeping = true;
            synchronized(this) {
                notify();
            }
            
        }
    }  

    @Override
    public void run() {
        while (true) {
            while (waitingQueue.isEmpty()) {
                System.out.println("Barber is sleeping");
                isSleeping = true;
                try {
                    synchronized(this) {
                        wait();
                    }
                    
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            Customer currCustomer = waitingQueue.poll();
            // System.out.println("Barber cutting hair for customer " + currCustomer.getName());
            try {
                System.out.println("Hair cut done, customer leaving " + currCustomer.getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
    
}
