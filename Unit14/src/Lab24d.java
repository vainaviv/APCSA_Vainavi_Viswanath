//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("H:\\Unit14_2016\\Unit14-Assignments\\Lab24d.dat"));
		int size = file.nextInt();
		String[] games = new String[size];
		file.nextLine();
		int i=0;
		while (file.hasNextLine()){
			games[i] = file.nextLine();
			i++;
		}
		for (int j=0; j < size; j++){
			TicTacToe test = new TicTacToe(games[j]);
			System.out.println(test);
		}







	}
}



