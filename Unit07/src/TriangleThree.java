//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = " ";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i=1; i<=size; i++){
			for (int y=size; y>=1; y--){
				output += " ";
			}
			for (int x=1; x<=i; x++){
				//output.setCharAt(size-x, (char)letter);
				output += letter;
			}
			output += "\n";
		}
		return output+"\n";
	}
}