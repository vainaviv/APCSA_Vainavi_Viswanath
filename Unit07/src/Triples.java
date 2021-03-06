//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int i=1; i<=c; i++){
			if (a%i == 0 && b%i == 0 && c%i ==0){
				max = i;
			}
		}

		return max;
	}

	public String toString()
	{
		String output="";
		for (int x=1; x<= number; x++){
			for (int y=1; y<=x; y++){
				for (int z=1; z<=number; z++){
					if (Math.pow((double)x, 2)+ Math.pow((double)y,2) == Math.pow((double)z,2)){
						if (greatestCommonFactor(x,y,z) == 1){
							output += y + " " + x + " " + z + "\n";
						}
					}
				}
			}
		}
		
		return output+"\n";
	}
}