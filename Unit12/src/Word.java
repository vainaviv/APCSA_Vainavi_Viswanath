//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	public String getWord(){
		return word;
	}

	public int compareTo( Word rhs )
	{;
		if (this.length() > rhs.getWord()){
			return 1;
		}
		else if (word.length() < rhs.getWord()){
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return "";
	}
}