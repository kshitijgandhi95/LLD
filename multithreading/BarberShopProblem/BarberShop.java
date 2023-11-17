package BarberShopProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarberShop {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Barber barber = new Barber(3);
        service.execute(barber);
        Thread.sleep(1000);

        for (int i=0; i<5; i++) {
            Customer customer = new Customer(Thread.currentThread().getName() +"-"+ i, barber);
            // System.out.println("Customer going to barber shop " + customer.getName());
            service.execute(customer);
            Thread.sleep(1000*i);
        }

    }
}
