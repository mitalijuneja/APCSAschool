package unit4;

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;
	private char firstLetter;
	private char lastLetter;

	public FirstAndLast()
	{
		word = "";


	}

	public FirstAndLast(String s)
	{

		setString(s);
		findFirstLastLetters();

	}

	public void setString(String s)
	{
		word = s;

	}

	public void findFirstLastLetters()
	{

		firstLetter = word.charAt(0);
		lastLetter = word.charAt(word.length()-1);

	}

 	public String toString()
 	{
 		String output="";




 		return output;
	}
}
