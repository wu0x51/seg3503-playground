import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

    @Test
    void testEquivalence() {
        Tic board = new Tic(3, 3);
        Tic board2 = new Tic(3, 3);
        assertEquals(board, board2);
    }

    @Test
    void testIfEmpty() {
        Tic tic = new Tic(0, 0);
        assertEquals(true, tic.isEmpty());
    }

    @Test
    void testIfNotEmpty() {
        Tic tic = new Tic(3, 3);
        tic.place(0, 0);
        assertEquals(false, tic.isEmpty());
    }

    @Test
    void testCorrectTurn() {
        Tic tic = new Tic(3, 3);
        tic.place(0, 0);
        tic.place(0, 1);
        assertEquals("X", tic.board[0][0]);
        assertEquals("O", tic.board[0][1]);
    }

}
