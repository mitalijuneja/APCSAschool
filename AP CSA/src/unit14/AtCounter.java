package unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		
		
		if ((r >=0 && r<atMat.length) && (c >=0 && c<atMat[r].length) && atMat[r][c] == '@')
		{
			atCount = atCount + 1;
			atMat[r][c] = '-';
			
			
			if (c - 1 >= 0)
			{
				countAts(r, c-1);
			}
			
			if (c + 1 < atMat[r].length)
			{
				countAts(r, c+1);
			}
			
			if (r-1 >=0)
			{
				countAts(r-1, c);
			}
			
			if (r+1 < atMat.length)
			{
				countAts(r+1, c);
			}
		}
		
		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		atCount = 0;
		return output;
	}
	
	
}