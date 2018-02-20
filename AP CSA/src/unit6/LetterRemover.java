package unit6;

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("hi", 'h');
	}

	//add in second constructor
	
	public LetterRemover(String s, char rem)
	{
		setRemover(s,rem);
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		int position = cleaned.indexOf(lookFor);
		
		while (position >=0)
		{
			cleaned = cleaned.substring(0, cleaned.indexOf(lookFor)) + cleaned.substring(cleaned.indexOf(lookFor) + 1);
			position = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}
