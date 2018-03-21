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
				return mat[i][0] + " winner found horizontally";
			}
		}
		










		return "";
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




		return output+"\n\n";
	}
}