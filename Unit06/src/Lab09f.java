//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover();
		
		test.setRemover("I am Sam I am", 'a');
		System.out.println(test);
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test);
		
		test.setRemover("abababababa", 'b');
		System.out.println(test);
		
		test.setRemover("abaababababa", 'x');
		System.out.println(test);
	}
}