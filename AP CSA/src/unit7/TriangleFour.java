package unit7;

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
		size= 1;
		letter = "M";
		
	}

	public TriangleFour(int count, String let)
	{
		setTriangle (let, count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i = size; i > 0; i --)
		{
			for (int j = i; j < size; j++)
			{
				output = output + " ";
			}
			for (int k = i; k >0; k--)
			{
				output = output + letter;
			}
			output = output + "\n";
		}
		return output+"\n";
	}
}
