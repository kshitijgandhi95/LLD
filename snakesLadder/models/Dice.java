package snakesLadder.models;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int numOfDice;
    private int min = 1;
    private int max = 6;
    

    public Dice (int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int rollDice () {
        int sum = 0;
        for (int i=0; i<this.numOfDice; i++) {
            sum+= ThreadLocalRandom.current().nextInt(this.min, this.max+1);
        }
        return sum;
    }
}
