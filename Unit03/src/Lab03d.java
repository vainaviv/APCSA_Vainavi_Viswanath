//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		Distance test = new Distance();
		
		System.out.println("Enter X1 ::  ");
		int x1 = keyboard.nextInt();
		
		System.out.println("Enter Y1 ::  ");
		int y1 = keyboard.nextInt();
		
		System.out.println("Enter X2 ::  ");
		int x2 = keyboard.nextInt();
		
		System.out.println("Enter Y2 ::  ");
		int y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		System.out.println("Enter X1 ::  ");
		x1 = keyboard.nextInt();
		
		System.out.println("Enter Y1 ::  ");
		y1 = keyboard.nextInt();
		
		System.out.println("Enter X2 ::  ");
		x2 = keyboard.nextInt();
		
		System.out.println("Enter Y2 ::  ");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		System.out.println("Enter X1 ::  ");
		x1 = keyboard.nextInt();
		
		System.out.println("Enter Y1 ::  ");
		y1 = keyboard.nextInt();
		
		System.out.println("Enter X2 ::  ");
		x2 = keyboard.nextInt();
		
		System.out.println("Enter Y2 ::  ");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
			
	}
}