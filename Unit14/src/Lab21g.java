//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter

		//test the code
		AtCounter test = new AtCounter();
		int row = 0;
		int col = 0;
		test.countAts(row,col);
		test.getAtCount();
		System.out.println(row + " " + col + " has " + test);
		
		AtCounter test1 = new AtCounter();
		row = 2;
		col = 5;
		test1.countAts(row,col);
		test1.getAtCount();
		System.out.println(row + " " + col + " has " + test1);
	
		AtCounter test2 = new AtCounter();
		row = 5;
		col = 0;
		test2.countAts(row,col);
		test2.getAtCount();
		System.out.println(row + " " + col + " has " + test2);
		
		AtCounter test3 = new AtCounter();
		row = 9;
		col = 9;
		test3.countAts(row,col);
		test3.getAtCount();
		System.out.println(row + " " + col + " has " + test3);
		
		AtCounter test4 = new AtCounter();
		row = 3;
		col = 9;
		test4.countAts(row,col);
		test4.getAtCount();
		System.out.println(row + " " + col + " has " + test4);
		
	}
}