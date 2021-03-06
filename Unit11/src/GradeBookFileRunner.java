//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;

public class GradeBookFileRunner

{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");

			Scanner file = new Scanner(new File("gradebook.dat"));
			
			String class_name = file.nextLine();
			int studentCount = file.nextInt();
			ArrayList<Class> classes = new ArrayList<Class>();
			Class subject = new Class(class_name, studentCount);
			classes.add(subject);
			file.nextLine();
			for (int i=0; i< studentCount; i++){
				String student = file.nextLine();
				String gradeList = file.nextLine();
				//System.out.println(gradeList);
				Student person = new Student(student,gradeList);
				subject.addStudent(i,person);
			}
			System.out.println(subject);
		
			subject.sort();
			System.out.println(subject);
			
			out.println("Failure List = " + subject.getFailureList(70));	
			out.println("Highest Average = " + subject.getStudentWithHighestAverage());
			out.println("Lowest Average = " + subject.getStudentWithLowestAverage());

		













	}		
}