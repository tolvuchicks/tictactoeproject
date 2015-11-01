package is.ru.tictactoe;

public class TicTacToe 
{
	public static int SIZE = 3;
	private char[][] board;
	private char humanPlayer;

	public TicTacToe()
	{
		board = new char[SIZE][SIZE];
		humanPlayer = 'X';

		initialize();
	}

	// Initialize board as empty
	public void initialize()
	{
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				board[i][j] = ' ';
			}
		}
	}

	// Print board on screen
	// TODO: FINISH
	 public void printBoard() 
    {
        System.out.println("-------------");
		
        for (int i = 0; i < SIZE; i++) 
        {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) 
            {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

	// Check if board is full, returns true if so
	// TODO: EDIT content of inner loop when the 
	// the game has more logic
	public boolean checkFull()
	{
		boolean full = true;
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				if(board[i][j] == ' ')
				{
					full = false;
				}
			}
		}
		return full;
	}

	public boolean placeMark(int row, int col) 
    {		
        // If mark is not inside board, return false
        if ((row >= 0) && (row < SIZE)) 
        {
            if ((col >= 0) && (col < SIZE)) 
            {
                if (board[row][col] == ' ') 
                {
                    board[row][col] = humanPlayer;
                    return true;
                }
            }
        }	
        return false;
    }

    public boolean checkWinRow() 
    {
    	for (int i = 0; i < SIZE; i++) 
    	{
    		if(checkWinHelper(board[i][0], board[i][1], board[i][2]))
        	{
        		return true;
        	}
    	}
    	return false;
    }

    public boolean checkWinColumns() 
	{
     	for (int i = 0; i < SIZE; i++) 
     	{
         	if (checkWinHelper(board[0][i], board[1][i], board[2][i])) 
         	{
         	    return true;
        	}
    	 }
     return false;
 	}

 	// Checks if there is a winner with a diagonal row
    public boolean checkWinDiagonal()
	{
		return ((checkWinHelper(board[0][0], board[1][1], board[2][2])) || (checkWinHelper(board[0][2], board[1][1], board[2][0])));
	}

	public boolean checkWinHelper(char first, char second, char third) 
	{

        return ((first != ' ') && (first == second) && (second == third));
    }

	// Changes players between rounds
	public void changePlayer()
	{
		if(humanPlayer == 'x')
		{
			humanPlayer = 'o';
		}
		else
		{
			humanPlayer = 'x';
		}
	}
}
