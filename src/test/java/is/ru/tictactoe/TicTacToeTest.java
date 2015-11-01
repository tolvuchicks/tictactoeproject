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
    public void checkWinRowTest()
    {
    	TicTacToe test = new TicTacToe();

    	test.placeMark(0, 0);
    	test.placeMark(0, 1);
    	test.placeMark(0, 2);

    	assertEquals(true, test.checkWinRow());
    }

}