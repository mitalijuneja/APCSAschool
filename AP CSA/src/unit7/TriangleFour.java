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
		return "#";
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}
