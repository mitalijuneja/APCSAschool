package unit4;

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "";

	}

	public StringChecker(String s)
	{
		setString(s);
		
	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		int letterIndex = word.indexOf(c);
		if (letterIndex == -1)
		{
			return false;
		}


		return true;
	}

	public boolean findSubString(String s)
	{
		int stringIndex = word.lastIndexOf(s);
		if (stringIndex == -1)
		{
			return false;
		}


		return true;
	}

 	public String toString()
 	{
 		return  word + "\n\n";
	}
}
