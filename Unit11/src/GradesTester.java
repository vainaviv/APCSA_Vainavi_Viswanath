//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradesTester
{
   public static void main( String args[] )
   {
		Grades test = new Grades("5 - 90 85 95.5 77.5 88");
		out.println(test);
		out.println("sum = " + test.getSum());	
		out.println("num grades = " + test.getNumGrades());											
		out.println("low grade = " + test.getLowGrade());		
		out.println("high grade = " + test.getHighGrade());
		out.println(" \n");
		
		Grades test2 = new Grades("9 - 10 70 90 92.5 85 95.5 77.5 88 100.0");
		out.println(test2);
		out.println("sum = " + test2.getSum());
		out.println("num grades = " + test2.getNumGrades());
		out.println("low grades = " + test2.getLowGrade());
		out.println("high grade = " + test2.getHighGrade());
	}		
}