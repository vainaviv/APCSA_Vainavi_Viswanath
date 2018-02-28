//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private double percent;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int answer = rand.nextInt(upperBound) + 1;
		int guess = 1;
		int times = 0;
		do {
			if (1 <= guess && guess <= upperBound){
				System.out.printf("Enter a number between 1 and %d \n", upperBound);
				guess = keyboard.nextInt();
				times ++;
			}else {
				System.out.println("Number out of range!");
				System.out.printf("Enter a number between 1 and %d \n", upperBound);
				guess = keyboard.nextInt();
				times ++;
		} 
		} while (answer != guess);
		
		System.out.printf("It took %d guesses to guess %d \n", times, guess);
		percent = (((double)times -1)/(double)times)*100;


	}

	public String toString()
	{
		String output="You guessed wrong " + percent + " percent of the time";
		return output;
	}
}