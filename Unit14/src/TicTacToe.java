//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		this();
		int index = 0;
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				mat[i][j] = game.charAt(index);
				index ++;
			}
		}

	}

	public String getWinner()
	{
		int oCount = 0;
		int xCount = 0;
		// check horizontal
		for (int i=0; i < mat.length; i++){
			oCount = 0;
			xCount=0;
			for (int j=0; j<mat[0].length; j++){
				if (mat[i][j] == 'O'){
					oCount++;
				}
				else if (mat[i][j] == 'X'){
					xCount++;
				}
				if (oCount == 3){
					return "O wins horizontally";
				}
				else if (xCount == 3){
					return "X wins horizontally";
				}
			}
		}


		// check vertical
		for (int i=0; i<mat[0].length; i++){
			oCount = 0;
			xCount = 0;
			for (int j=0; j<mat.length; j++){
				if (mat[j][i] == 'O'){
					oCount++;
				}
				else if (mat[j][i] == 'X'){
					xCount++;
				}
				if (oCount == 3){
					return "O wins vertically";
				}
				else if (xCount == 3){
					return "X wins vertically";
				}
			}
		}
		
		
		// check diagonal from top left to bottom right
		oCount = 0;
		xCount = 0;
		for (int i=0; i<mat.length; i++){
			if (mat[i][i] == 'O'){
				oCount ++;
			}
			else if (mat[i][i] == 'X'){
				xCount ++;
			}
		}
		if (oCount == 3){
			return "O wins diagonally";
		}
		else if (xCount == 3){
			return "X wins diagonally";
		}
		
		// check diagonal from top right to bottom left
		oCount = 0;
		xCount = 0;
		for (int i=0; i < mat.length; i++){
			if (mat[i][mat.length-1-i] == 'X'){
				xCount ++;
			}
			else if (mat[i][mat.length-1-i] == 'O'){
				oCount ++;
			}
		}
		if (oCount == 3){
			return "O wins diagonally";
		}
		else if (xCount == 3){
			return "X wins diagonally";
		}

		return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="";
		for (int r=0; r<mat.length; r++){
			for (int c=0; c<mat[0].length; c++){
				output += mat[r][c];
			}
			output += "\n";
		}
		output += getWinner();
		
		return output+"\n\n";
	}
}