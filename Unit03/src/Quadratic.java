//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
		rootOne = 0;
		rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA,quadB,quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}
	public void calcRoots( )
	{
		rootOne = (-(double)b + sqrt(pow((double)b,2)-(4*(double)a*(double)c)))/(2*(double)a); 
		rootTwo = (-(double)b - sqrt(pow((double)b,2)-(4*(double)a*(double)c)))/(2*(double)a); 

	}

	public void print( )
	{
		System.out.printf("rootone :: %.2f \n",rootOne);
		System.out.printf("roottwo :: %.2f \n\n", rootTwo);

	}
}