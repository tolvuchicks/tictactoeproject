package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToeGame
{
	public static void main(String[] args)
	{
		TicTacToe game = new TicTacToe();
		Scanner in = new Scanner(System.in);

		System.out.println("Velkomin/nn í TicTacToe! Til þess að velja reit þarf að velja viðkomandi tölur:\n"
			+ "Fyrri talan er x og seinni talan er y \n");
		game.printBoardHelp();
	
		while(!game.checkFull() && !game.checkWin())
		{	 
			 System.out.println("Sláðu inn x og y \n");
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
		    	 System.out.println("Vitlaust valið, gerðu aftur!");
		     }
		}
		
		if (game.checkWin()) 
		{
			System.out.println("Kæru gestir, við erum komin með sigurvegara!");
			System.exit(0);
		}
		else if (game.checkFull()) 
		{
			System.out.println("Jafntefli!");
			System.exit(0);
		}
		}
}