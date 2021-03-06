//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		start = 0;
		stop = 0;
	}

	public LoopStats(int beg, int end)
	{
		setNums(beg,end);
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int count = start; count <= stop; count++)
		{
			if ((count % 2) == 0) {
				evenCount += 1;
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int count = start; count <= stop; count++)
		{
			if ((count % 2) != 0) {
				oddCount += 1;
			}
		}

		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int count = start; count <= stop; count++)
		{
			total += count;
		}
		
		return total;
	}
	
	public String toString()
	{
		return start + " " + stop + "\ntotal " + getTotal() + "\neven count " + getEvenCount() + "\nodd count " + getOddCount() + "\n";
	}
}