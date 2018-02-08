//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 0;

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (65 <= theChar && theChar <=90){
			return true;
		}else {
			return false;
		}
	}

	public boolean isLower( )
	{
		if (97 <= theChar && theChar <=122){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if (48 <= theChar && theChar <=57){
			return true;
		}else {
			return false;
		}
	}	

	public int getASCII( )
	{
		return (int) theChar;
	}

	public String toString()
	{
		if (isLower() == true){
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else if (isUpper() == true){
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} else {
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
			  
	}
}