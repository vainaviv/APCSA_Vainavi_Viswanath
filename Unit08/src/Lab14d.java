//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.lang.System;
import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		int length;
		String  response;
		Grades test = new Grades();
		
		/*		double[] nums = {100,90,85,72.5,95.6};
		test.length(nums);
		test.setGrades(nums);
		System.out.println(test);
	
*/
		do {
			System.out.println("Please enter the length of the grades array.");
			length = keyboard.nextInt();
			
			double[] nums = new double[length];
			
			System.out.println("Please enter elements of the grades array.");
			for (int i=0; i < length; i++){
				double userInput = keyboard.nextDouble();
				nums[i]=userInput;
			}
			
			test.length(nums);
			test.setGrades(nums);
			System.out.println(test);
			
			System.out.println("Do you have more grade arrays?");
			response = keyboard.next();
		} while (response.equals("y"));
		

		
	}
}