package snakesLadder.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private ArrayList<Cell> cells;
    private Map<Cell, Boolean> hasJumper = new HashMap<Cell, Boolean>();
    Board (int cells, int snakes, int ladders) {
        //add cells
        initializeCells(cells);
        //create snakes and add it to cells
        addSnakes (snakes, cells);
        addLadders (ladders, cells);
        //create ladders and add it to cells
        
    }

    private void initializeCells(int boardSize) {
        cells = new ArrayList<>();
        for(int i=0;i<boardSize;i++) {
            for(int j=0; j<boardSize;j++) {
                Cell cellObj = new Cell();
                cells.add (cellObj);
            }
        }
    }

    public int getSize() {
        return cells.size();
    }

    private void addSnakes (int snakes, int boardSize) {
        for (int i=0; i<snakes; i++) {
            boolean isValid = false;
            SnakeJumper s = new SnakeJumper(0, 0);
            while (!isValid) {
                int start = ThreadLocalRandom.current().nextInt(1, boardSize);
                int end = ThreadLocalRandom.current().nextInt(1, boardSize);
                s = new SnakeJumper(start, end);
                if (s.isValid() && (!hasJumper.containsKey(this.cells.get(start)) && !hasJumper.containsKey(this.cells.get(start)) )) {
                    isValid = true;
                }
            }
            Cell c = this.cells.get(s.getStart());
            hasJumper.put(c, true);
            hasJumper.put(this.cells.get(s.getEnd()), true);
            c.setJumper(s);
        }
    }

    private void addLadders (int ladder, int boardSize) {
        for (int i=0; i<ladder; i++) {
            boolean isValid = false;
            LadderJumper s = new LadderJumper(0, 0);
            while (!isValid) {
                int start = ThreadLocalRandom.current().nextInt(1, boardSize);
                int end = ThreadLocalRandom.current().nextInt(1, boardSize);
                s = new LadderJumper(start, end);
                if (s.isValid() && (!hasJumper.containsKey(this.cells.get(start)) && !hasJumper.containsKey(this.cells.get(start)) )) {
                    isValid = true;
                }
            }
            Cell c = this.cells.get(s.getStart());
            c.setJumper(s);
        }
    }

    Cell getCell (int playerPosition) {
        return this.cells.get(playerPosition);
    }
    
}
