package snakesLadder.models;

public class SnakeJumper extends Jumper{

    public SnakeJumper(int start, int end) {
        super(JumperType.FALL, start, end);
    }

    public boolean isValid () {
        return this.getStart() > this.getEnd(); 
    }  
} 
