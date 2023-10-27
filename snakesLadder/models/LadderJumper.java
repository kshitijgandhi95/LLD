package snakesLadder.models;

public class LadderJumper extends Jumper{

    public LadderJumper(int start, int end) {
        super(JumperType.RISE, start, end);
    }

    public boolean isValid () {
        return this.getStart() < this.getEnd(); 
    }  
}
