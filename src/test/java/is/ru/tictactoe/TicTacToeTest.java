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
    public void checkWinRowTest()
    {
    	TicTacToe test = new TicTacToe();

    	test.placeMark(0, 0);
    	test.placeMark(0, 1);
    	test.placeMark(0, 2);

    	assertEquals(true, test.checkWinRow());
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

    @Test 
    public void checkWinHelperTest()
    {
        TicTacToe test = new TicTacToe();

        assertEquals(false, test.checkWinHelper(' ', ' ', ' '));
    }
    
    @Test
    public void checkDiagonalWinTest2()
    {
    	TicTacToe t = new TicTacToe();

    	t.placeMark(0, 2);
    	t.placeMark(1, 1);
    	t.placeMark(2, 0);

    	assertEquals(true, t.checkWinDiagonal());
    }

    @Test
    public void checkDiagonalWinTest3()
    {
    	TicTacToe t = new TicTacToe();

    	t.placeMark(0, 0);
    	t.placeMark(0, 1);
    	t.placeMark(0, 2);

    	assertEquals(false, t.checkWinDiagonal());

    }

    @Test
    public void checkInputTest()
    {
        TicTacToe test = new TicTacToe();

        assertEquals(false, test.checkInput(4, 4));
    }

    @Test
    public void checkWinTest1()
    {
        TicTacToe t = new TicTacToe();

        t.placeMark(0, 0);
        t.placeMark(0, 1);
        t.placeMark(0, 2);

        assertEquals(true, t.checkWin());
    }

    @Test
    public void checkWinTest2()
    {
        TicTacToe t = new TicTacToe();

        t.placeMark(0, 0);
        t.placeMark(1, 1);
        t.placeMark(2, 2);

        assertEquals(true, t.checkWin());
    }

    @Test
    public void checkWinTest3()
    {
        TicTacToe t = new TicTacToe();

        t.placeMark(0, 0);
        t.placeMark(1, 0);
        t.placeMark(2, 0);

        assertEquals(true, t.checkWin());
    }

    @Test
    public void checkWinTest4()
    {
        TicTacToe t = new TicTacToe();

        t.placeMark(0, 0);
        t.placeMark(1, 1);
        t.placeMark(0, 2);

        assertEquals(false, t.checkWin());
    }
}