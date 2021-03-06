//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	//instance variables
	
	private int length;
	private double[] grades;

	//constructor
	public Grades()
	{
		length = 0;
		grades = new double[length];
	}
	
	public void setGrades (double[]nums)
	{
		grades = nums;
	}

	public void length(double[] grades2) {
		// TODO Auto-generated method stub
		length = grades2.length;
	}
	//set method

	private double getSum()
	{
		double sum=0.0;
		for (int spot=0; spot < length; spot++)
		{
			sum += grades[spot];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/length; 
		return average;
	}

	//toString method
	public String toString()
	{
		Arrays.sort(grades);
		String output = "";
		for (int spot = 0; spot <length; spot++)
		{
			output += "grade " + spot + ":: " + grades[spot] + "\n";
		}
		output += "sum = " + getSum() + "\n";
		output += "average = " + getAverage() + "\n";
		return output;
		
	}

}