package DiningPhilosphersProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class DiningTable {
    public static void main(String[] args) throws InterruptedException {
        List<Fork> forks = new ArrayList<>();
        // List<Philosphers> philosphers = new ArrayList<>();

        for (Integer i=1; i<=5; i++) {
            forks.add (new Fork(i));
        }
        ExecutorService service = Executors.newFixedThreadPool(4);
        for (Integer i=1; i<=5; i++) {
            service.execute((new PhilosphersWrong(Integer.toString(i), forks.get(i%5), forks.get((i+1)%5))));
            Thread.sleep(1000*i);
        }
    }
}
