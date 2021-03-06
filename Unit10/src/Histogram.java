//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		this();
		fileName = fName;
		for (int i=0; i < values.length; i++){
			letters.add(values[i]);
		}
		for (int i=0; i < letters.size(); i++){
			count.add(0);
		}

		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		try {
			Scanner file = new Scanner(new File(fileName));
			int lines = file.nextInt();
			for (int i=0; i<=lines; i++){
				String sentence = file.nextLine();
				for (int j=0; j < sentence.length(); j++){
					for (int x=0; x < letters.size(); x++){
						if (sentence.charAt(j) == (letters.get(x))){
							count.set(x, count.get(x) + 1);
						}
					}
				}
			}
			/*
			int x = 0;
			while(file.hasNext()){
				if (file.next().equals(letters.get(x))){
					 count.set(x, count.get(x) + 1);
				}
			}
			*/
		}
		catch(Exception e){
			System.out.println("Didn't work");
		}
			
	}

	public char mostFrequent()
	{
		int max = count.get(0);
		int pos = 0;
		for (int i=1; i< count.size(); i++){
			if (count.get(i) > max){
				max = count.get(i);
				pos = i;
			}
		}
		return letters.get(pos);
	}

	public char leastFrequent()
	{
		int min = count.get(0);
		int pos = 0;
		for (int i=1; i<count.size(); i++){
			if (count.get(i) < min){
				min = count.get(i);
				pos = i;
			}
		}

		return letters.get(pos);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}