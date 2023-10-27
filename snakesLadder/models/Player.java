package snakesLadder.models;

public class Player {
    private String id;
    private int currentPosition;

    public Player (String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition () {
        return this.currentPosition;
    }

    public String getId () {
        return this.id;
    }

    public void setCurrentPosition (int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
