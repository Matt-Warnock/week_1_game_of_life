package game;

public class Cell {
    boolean[] board;

    protected Cell(boolean[] board) {
        this.board = board;
    }
    public boolean isAlive(boolean square) {
        return square;
    }

    public int numberOfNeighbours(boolean square) {
        throw new UnsupportedOperationException();
    }
}
