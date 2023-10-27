package snakesLadder.models;

public abstract class Jumper {
    private JumperType type;
    private int start;
    private int end;

    public Jumper (JumperType type, int start, int end) {
        this.type = type;
        this.start = start;
        this.end = end;
    }

    public int getEnd () {
        return this.end;
    }

    public int getStart () {
        return this.start;
    }

    public JumperType getType () {
        return this.type;
    }
}