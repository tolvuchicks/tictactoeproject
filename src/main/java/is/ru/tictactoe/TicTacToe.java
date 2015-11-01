package is.ru.tictactoe;

public class TicTacToe 
{
	public static int SIZE = 3;
	private char[][] board;
	private char humanPlayer;

	public TicTacToe()
	{
		board = new char[SIZE][SIZE];
		humanPlayer = 'x';

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
	public static boolean checkFull()
	{
		boolean full = true;
		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				//if(board[i][j] == ' ')
				//{
				//	full = false;
				//}
				full = false;
			}
		}
		return full;
	}

}
