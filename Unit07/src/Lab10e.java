//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		//char response;
		String response = "y";
		
		do {
			System.out.print("Guessing Game - how many numbers?");
			int stop = keyboard.nextInt();
			GuessingGame test = new GuessingGame(stop);
			test.playGame();
			System.out.println(test);
			
			System.out.println("Do you want to play again?");
			response = keyboard.next();
			
		}while (response.equals("y"));
		
		

	}
}