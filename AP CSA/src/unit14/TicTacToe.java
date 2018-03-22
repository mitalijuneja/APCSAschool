package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;
	int count;

	public TicTacToe()
	{
		mat = new char[0][0];
		count = 0;

	}

	public TicTacToe(String game)
	{
		count = 0;
		Scanner chopper = new Scanner (game);
		mat = new char[3][3];
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat.length; j++)
			{
				mat[i][j] = game.charAt(mat.length*i+j);
			}
		}
	}

	public String getWinner()
	{
		for (int i = 0; i < mat.length; i++)
		{
			if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2] )
			{
				return mat[i][0] + " wins horizontally";
			}
		}
		for (int j = 0; j < mat.length; j++)
		{
			if (mat[0][j] == mat[1][j] && mat[1][j] == mat[2][j])
			{
				return mat[0][j] + " wins vertically";
			}
		}
		if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
		{
			return mat[0][0] + " wins diagonally";
		}
		if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
		{
			return mat[0][2] + " wins diagonally";
		}
		


		return "draw - no winner found";
	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				output = output + mat[i][j]  + " ";
			}
			output = output + "\n";
		}
		output = output + getWinner();
		return output+"\n\n";
	}
}