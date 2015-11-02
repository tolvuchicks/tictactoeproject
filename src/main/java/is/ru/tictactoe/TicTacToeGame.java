package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToeGame
{
	public static void main(String[] args)
	{
		TicTacToe game = new TicTacToe();

		game.printBoard();

		while(!game.checkFull() && !game.checkWin())
		{
			Scanner in = new Scanner(System.in);

			System.out.println("Sladu inn x og y \n");

			int x = in.nextInt();
			int y = in.nextInt();

			if(game.checkInput(x, y))
			{
				game.placeMark(x, y);
				game.printBoard();
				game.changePlayer();
			}
		}

		if(game.checkWin())
		{
			System.out.println("Sigurvegari!");
			System.exit(0);
		}
		else if(game.checkFull())
		{
			System.out.println("Enginn Sigurvegari");
		}
	}
}