//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = " ";

	}

	public StringChecker(String s)
	{
		setString(s);

	}

   public void setString(String s)
   {
	   word=s;
   }

	public boolean findLetter(char c)
	{
		int val = word.indexOf(c);
		if ( val >= 0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean findSubString(String s)
	{
		int val = word.indexOf(s);
		if ( val >=0){
			return true;
		}else {
			return false;
		}
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}