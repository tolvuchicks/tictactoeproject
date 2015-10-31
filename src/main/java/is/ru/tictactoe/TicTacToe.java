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

	public void printBoard()
	{
		System.out.println("-------------");
	}

    public static int main(String text) 
    {
		return 1;
    }
}
