package DiningPhilosphersProblem;

public class PhilosphersWrong implements Runnable{
    private String name;
    private boolean isThinking;
    private Fork leftFork;
    private Fork rightFork;
    
    PhilosphersWrong (String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.isThinking = true;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void makePhilospherEat() {
        this.isThinking = false;
    }

    public String getName () {
        return this.name;
    }

    @Override
    public void run() {
        while(true) {
            while (isThinking) {
                try {
                    Thread.sleep (5000);
                    System.out.println("Philospher is getting humgry " + getName());
                    isThinking = false;
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            // System.out.println("Philospher trying to get forks " + getName());
            leftFork.useFork(this);
            rightFork.useFork(this);
            System.out.println("Food eaten by philospher " + getName());
            isThinking = true;
        }
    }
}
