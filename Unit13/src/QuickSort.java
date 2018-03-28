//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, 0, list.length-1);
		System.out.println(Arrays.toString(list));

	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if (low<high){
			int pi = partition(list, low, high);
			System.out.println(Arrays.toString(list));
			quickSort(list, low, pi);
			quickSort(list, pi+1, high);
		}
	
	}


	private static int partition(Comparable[] list, int low, int high)
	{

		Comparable pivot = list[low];
		int bot= low-1;
		int top = high + 1;
		
		while (bot < top){
			while ((list[bot+1]).compareTo(pivot) < 0){
				bot ++;
				System.out.println("bot " + bot);
			}
			System.out.println("top " + top);
			while (list[top-1].compareTo(pivot) > 0){
				top --;
				System.out.println("top " + top);
			}
			if ((bot+1) == (top-1)){
				return top;
			}
				Comparable temp = list[bot+1];
				list[bot+1] = list[top-1];
				list[top-1] = temp;
				//System.out.println(bot + " " + top);
		}
		
		return top;
	}
}