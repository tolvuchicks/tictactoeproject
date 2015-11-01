package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    // This tests if the double for loop in 
    // function works
    @Test
    public void checkIfBoardIsEmptyTest()
    {
    	TicTacToe test = new TicTacToe();

        assertEquals(false, test.checkFull());
    }

    @Test
    public void placeMarkTest()
    {
        TicTacToe test = new TicTacToe();

        assertEquals(false, test.placeMark(4, 4));
    }

    @Test
    public void checkIfBoardIsFullTest()
    {
        TicTacToe test = new TicTacToe();
        test.placeMark(0, 0);
        test.placeMark(0, 1);
        test.placeMark(0, 2);
        test.placeMark(1, 0);
        test.placeMark(1, 1);
        test.placeMark(1, 2);
        test.placeMark(2, 0);
        test.placeMark(2, 1);
        test.placeMark(2, 2);

        assertEquals(true, test.checkFull());
    }

}