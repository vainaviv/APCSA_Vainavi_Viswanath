//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean bound_exit;

	public Maze()
	{
		maze = new int[0][0];
	}

	public Maze(int size, int[] values)
	{
		bound_exit = false;
		maze = new int[size][size];
		int index = 0;
		for (int i=0; i< maze.length; i++){
			for (int j=0; j< maze[0].length; j++){
				maze[i][j] = values[index];
				index ++;
			}
		}
	}

	public void hasExitPath(int r, int c)
	{
		if (r>=0 && c>=0 && r<maze.length && c<maze[0].length && maze[r][c] == 1){
			if (c == maze[0].length-1){
				bound_exit = true;
			}
			else{
					maze[r][c] = 0;
					hasExitPath(r,c+1);
					hasExitPath(r,c-1);
					hasExitPath(r-1,c);
					hasExitPath(r+1,c);
					maze[r][c] = 1;
			}
		}
	}


	public String toString()
	{
		String output = "";
		for (int r=0; r<maze.length; r++){
			for (int c=0; c<maze[0].length; c++){
				output += maze[r][c] + " ";
			}
			output += "\n";
		}	
			
		if (bound_exit == true){
			output += "exit found";
		}
		else{
			output += "exit not found";
		}
	return output;
}
}