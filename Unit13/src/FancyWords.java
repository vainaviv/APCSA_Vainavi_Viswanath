//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void setWords(String sentence)
	{
		
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;

		for (int i=0; i<wordRay.length; i++){
			if (wordRay[i].length()>max){
				max = wordRay[i].length();
			}
			wordRay[i] = new StringBuffer(wordRay[i]).reverse().toString();
		}
		Collections.reverse(Arrays.asList(wordRay));
		//System.out.println(Arrays.toString(wordRay));
	
		for (int c=0; c < wordRay.length; c++){
		while (wordRay[c].length() < max){
				wordRay[c] += " ";
			}
		}
		for (int w=0; w<max;w++){
			for (int r=0; r<wordRay.length; r++){
				output += wordRay[r].charAt(w);
			}
			output += "\n";
		}


		return output+"\n\n";
	}
}