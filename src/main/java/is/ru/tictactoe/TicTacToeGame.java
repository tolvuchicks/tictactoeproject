package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToeGame
{
	public static void main(String[] args)
	{
		TicTacToe game = new TicTacToe();
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to the TicTacToe Game! To select your field, please follow this format:\n"
			+ "First x and then y (x y)\n");
		game.printBoardHelp();
	
		while(!game.checkFull() && !game.checkWin())
		{	 
			 System.out.println("Please enter x and y\n");
		     int x = in.nextInt();
		     int y = in.nextInt();
		     
		     if(game.checkInput(x, y))
		     {
		    	 game.placeMark(x, y);
			     game.printBoard();
			     game.changePlayer();
		     }
		     else
		     {
		    	 System.out.println("That's not a valid selection, please try again!");
		     }
		}
		
		if (game.checkWin()) 
		{
			System.out.println("~~ LADIES AND GENTLEMEN - WE HAVE A WINNER! ~~");
			System.exit(0);
		}
		else if (game.checkFull()) 
		{
			System.out.println("That's a tie!");
			System.exit(0);
		}
		}
}