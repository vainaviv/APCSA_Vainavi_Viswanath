//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lab18e;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for (int i=0; i<vowels.length(); i++){
			for (int j=0; j<word.length(); j++){
				if (vowels.charAt(i) == word.charAt(j)){
					vowelCount ++;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if (numVowels() > rhs.numVowels()){
			return 1;
		}
		else if (numVowels() < rhs.numVowels()){
			return -1;
		}
		else{
			if (word.compareTo(rhs.toString()) > 0){
				return 1;
			}
			else if (word.compareTo(rhs.toString()) < 0){
				return -1;
			}
		}
		return 0;

	}

	public String toString()
	{
		return word;
	}
}