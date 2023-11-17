import java.util.concurrent.*;

class BarberShopN implements Runnable {
    private final int maxSeats;
    private final BlockingQueue<Customer> waitingRoom;
    private boolean barberSleeping;

    public BarberShopN(int maxSeats) {
        this.maxSeats = maxSeats;
        this.waitingRoom = new LinkedBlockingQueue<>(maxSeats);
        this.barberSleeping = true;
    }

    public void customerArrives(Customer customer) throws InterruptedException {
        if (waitingRoom.size() < maxSeats) {
            System.out.println(customer.getName() + " enters the shop and waits.");
            waitingRoom.offer(customer);

            if (barberSleeping) {
                barberSleeping = false;
                synchronized (this) {
                    notify(); // Wake up the barber
                }
            }
        } else {
            System.out.println(customer.getName() + " leaves because the shop is full.");
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (waitingRoom.isEmpty()) {
                    System.out.println("Barber is sleeping.");
                    barberSleeping = true;
                    synchronized (this) {
                        wait(); // Barber sleeps until a customer arrives
                    }
                }

                Customer nextCustomer = waitingRoom.poll();
                System.out.println("Barber cuts hair for " + nextCustomer.getName());

                // Simulate the time it takes to cut hair
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer implements Runnable {
    private final String name;
    private final BarberShopN barberShop;

    public Customer(String name, BarberShopN barberShop) {
        this.name = name;
        this.barberShop = barberShop;
    }

    public String getName() {
        return name;
    }

	@Override
	public void run() {
		try {
			barberShop.customerArrives(this);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class SleepingBarberProblem {
    public static void main(String[] args) {
    	BarberShopN barberShop = new BarberShopN(3);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Start the barber thread
        executorService.submit(barberShop);

        // Simulate customers arriving at the barber shop using Callable tasks
        for (int i = 1; i <= 5; i++) {
            Customer customer = new Customer("Customer " + i, barberShop);
            executorService.submit(customer);

            try {
                // Introduce a delay between customer arrivals
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
} 