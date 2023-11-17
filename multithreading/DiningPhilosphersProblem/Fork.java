package DiningPhilosphersProblem;

public class Fork {
    private int id;
    private boolean isAvailable;

    Fork (int id){
        this.id = id;
        this.isAvailable = true;
    }

    public synchronized void useFork (PhilosphersWrong philosphers) {
        System.out.println("Fork " + this.id + " is being used by " + philosphers.getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
