//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
   	Quadratic test = new Quadratic();
   	
   	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a :: ");
	int a = keyboard.nextInt();
	
	System.out.println("Enter b :: ");
	int b = keyboard.nextInt();
	
	System.out.println("Enter c :: ");
	int c = keyboard.nextInt();
	
	test.setEquation(a, b, c);
	test.calcRoots();
	test.print();
	
	System.out.println("Enter a :: ");
	a = keyboard.nextInt();
	
	System.out.println("Enter b :: ");
	b = keyboard.nextInt();
	
	System.out.println("Enter c :: ");
	c = keyboard.nextInt();
	
	test.setEquation(a, b, c);
	test.calcRoots();
	test.print();
	
	System.out.println("Enter a :: ");
	a = keyboard.nextInt();
	
	System.out.println("Enter b :: ");
	b = keyboard.nextInt();
	
	System.out.println("Enter c :: ");
	c = keyboard.nextInt();
	
	test.setEquation(a, b, c);
	test.calcRoots();
	test.print();
	}
   	
		
		
}
