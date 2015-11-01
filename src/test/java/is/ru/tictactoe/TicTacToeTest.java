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

}