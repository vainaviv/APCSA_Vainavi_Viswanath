//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff	
		this();
		try{
			Scanner file = new Scanner(new File(fileName));
			loadNouns();
			loadVerbs();
			loadAdjectives(); 
			while (file.hasNext()){
				String symbol = file.next();
				//System.out.print(symbol);
				if (symbol.equals("#")){
					String noun = getRandomNoun();
					System.out.print(noun + " ");
				}
				else if(symbol.equals("@")){
					String verb = getRandomVerb();
					System.out.print(verb + " "); 
				}
				else if (symbol.equals("&")){
					String adjective = getRandomAdjective();
					System.out.print(adjective + " ");
				}
				else{
					System.out.print(symbol + " ");
				}
			}
		
		}
		catch(Exception e)
		{
			out.println(" Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while (file.hasNext()){
				nouns.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("We have a problem with loading nouns");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (file.hasNext()){
				verbs.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("We have a problem with loading verbs");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while (file.hasNext()){
				adjectives.add(file.next());
			}
		}
		catch(Exception e)
		{
			out.println("We have a problem with loading adjectives");
		}
	}

	public String getRandomVerb()
	{
		int spot = (int)(Math.random()*verbs.size());
		return verbs.get(spot);
	}
	
	public String getRandomNoun()
	{
		int spot = (int)(Math.random()*nouns.size());
		return nouns.get(spot);
	}
	
	public String getRandomAdjective()
	{
		int spot = (int)(Math.random()*adjectives.size());
		return adjectives.get(spot);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}