package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    // This tests if the double for loop in 
    // function works
    @Test
    public void checkIfBoardIsFull()
    {
    	assertEquals(false, TicTacToe.checkFull());
    }

    @Test
    public void placeMarkTest()
    {
        TicTacToe test = new TicTacToe();

        assertEquals(false, test.placeMark(4, 4));
    }

    @Test
    public void checkDiagonalWinTest1()
    {
    	TicTacToe t = new TicTacToe();

    	t.board[0][0] = 'x';
    	t.board[1][1] = 'x';
    	t.board[2][2] = 'x';

    	assertEquals(true, t.cheWinDiagonal());
    }
}