package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		Scanner numberWords = new Scanner(sentence);
		int count = 0;
		while (numberWords.hasNext())
		{
			count++;
		}
		String[] words = new String[count];
		Scanner chopper = new Scanner (sentence);
		for (int i = 0; i < words.length; i++)
		{
			words[i] = chopper.next();
		}
		wordRay = words;
	}

	public String toString()
	{
		String output="";
		//int max = Integer.MIN_VALUE;
		for (int i = wordRay.length - 1; i >=0; i++)
		{
			output = output + wordRay[i].charAt(wordRay[i].length() -1);
		}





		return output+"\n\n";
	}
}
