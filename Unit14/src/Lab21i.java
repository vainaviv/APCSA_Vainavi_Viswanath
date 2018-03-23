//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit14_2016\\Unit14-Assignments\\lab21ib.dat"));
	
		//while (file.hasNextLine()){
		while (file.hasNext()){
			int size = file.nextInt();
			file.nextLine();
			System.out.println("");
			int[] maze = new int[size*size];
			int index = 0;
			while (file.hasNextInt() && index<size*size){
				maze[index] = file.nextInt();
				index ++;
			}

				Maze test = new Maze(size,maze);
				test.hasExitPath(0,0);
				System.out.println(test);
				
		}
	
		
	}
}