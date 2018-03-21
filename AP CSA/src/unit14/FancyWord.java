package unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   int size = s.length();
	   mat = new char[size][size];
	   
	   for (int i = 0; i < mat.length; i++)
	   {
		   for (int j = 0; j < mat[i].length; j++)
		   {
			   if (i == 0 || i == mat.length - 1)
			   {
				   mat[i][j] = s.charAt(j);
			   }
			   else
			   {
				  
				   if(j == i)
				   {
					   mat[i][j] = s.charAt(i);
					   
				   }
				   else if (j== mat[i].length - i - 1)
				   {
					   mat[i][j] = s.charAt(s.length() - i - 1);
				   }
			   }
		   }
	   }

	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				output = output + mat[i][j] + " ";
			}
			output = output + "\n";
		}





		return output+"\n\n";
	}
}