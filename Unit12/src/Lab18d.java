//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18d\\lab18d.dat"));
		ArrayList<Word> words = new ArrayList<Word>();

		int size = file.nextInt();
		while (file.hasNextLine()){
			Word word = new Word(file.nextLine());
			words.add(word);
		}
		
		for (int i=0; i < words.size()-1; i++){
			for (int j=0; j < words.size()-1; j++){
				if (words.get(j+1).compareTo(words.get(j)) < 0){
					
					Word temp = words.get(j+1);
					words.set(j+1, words.get(j));
					words.set(j, temp);
				}
			}
		
		}
		for (int i=0; i < words.size(); i++){
			System.out.println(words.get(i));
		}











	}
}