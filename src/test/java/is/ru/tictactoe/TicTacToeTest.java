package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    // This tests if the double for loop in 
    // function works
    @Test
    public void checkIfBoardIsFull()
    {
    	TicTacToe t = new TicTacToe();
    	assertEquals(false, t.checkFull());
    }

    @Test
    public void placeMarkTest()
    {
        TicTacToe test = new TicTacToe();

        assertEquals(false, test.placeMark(4, 4));
    }

    @Test
    public void checkWinColumnsTest() 
    {
        TicTacToe test = new TicTacToe();
        
        test.placeMark(0, 0);
        test.placeMark(1, 0);
        test.placeMark(2, 0);
        
        assertEquals(true, test.checkWinColumns());
    }

    @Test
    public void checkDiagonalWinTest1()
    {
    	TicTacToe t = new TicTacToe();

    	t.placeMark(0, 0);
    	t.placeMark(1, 1);
    	t.placeMark(2, 2);

    	assertEquals(true, t.checkWinDiagonal());
    }
}