package unit10;

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		setWord("Hi");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
		for (int i = 0; i < vowels.length(); i++)
		{
			for (int j = 0; j < word.length(); j++)
			{
				if (vowels.charAt(i) == word.charAt(j))
				{
					count++;
				}
			}

		}

		return count;
	}
	
	public int getLength()
	{
		int length = word.length();
		return length;
	}

	public String toString()
	{
	   String output = "";
	   output = output + word + "\nnum vowels = " + getNumVowels() + "\nnum chars = " + getLength();
	   
		return output;
	}
}