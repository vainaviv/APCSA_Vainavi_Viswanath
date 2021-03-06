//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String class_name, int stuCount)
	{
		name = class_name;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double sum = 0.0;
		for (int i=0; i<studentList.length; i++){
			sum += getStudentAverage(i);
		}
		classAverage = sum/studentList.length;
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		double average = studentList[stuNum].getAverage();
		return average;
	}

	public double getStudentAverage(String stuName)
	{
		double average =0;
		for (int i=0; i < studentList.length; i++){
			if (studentList[i].getName().equals(stuName)){
				average = studentList[i].getAverage();
			}
		}
		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		String name = studentList[stuNum].getName();
		return name;
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName = "";
		for (int i=0; i < studentList.length; i++){
			if (getStudentAverage(i) > high){
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i=0; i<studentList.length; i++){
			if (getStudentAverage(i) < low){
				low = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i=0; i < studentList.length; i++){
			if (getStudentAverage(i) < 60.0){
				output += getStudentName(i) + " ";
			}
		}
		return output;
	}
	
	public void sort(){
		Arrays.sort(studentList);
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i=0; i < studentList.length; i++){
			output += studentList[i] + " " + Double.toString(studentList[i].getAverage()) + "\n";
		}

		return output;
	}  	
}