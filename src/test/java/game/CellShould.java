package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellShould {
    boolean[] board = {true};

    @Test
    void returns_true_when_cell_is_alive() {
        boolean square = true;


        assertEquals(true, new Cell(board).isAlive(square));
    }
    @Test
    void returns_false_when_cell_is_dead() {
        boolean square = false;


        assertEquals(false, new Cell(board).isAlive(square));
    }

    @Test
    void returns_number_of_living_neighbours() {
        boolean[] board = {true, true};
        Cell cell = new Cell(board);
        boolean square = true;

        assertEquals(1, cell.numberOfNeighbours(square));
    }
}
