package unit10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		ArrayList<Word> w;
		w = new ArrayList<Word>();
		Scanner split = new Scanner (wordList);
		while (split.hasNext())
		{
			//System.out.println(split.next());

			Word word1 = new Word (split.next());
			w.add(word1);
		}
		words = w;


	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		for (Word w: words)
		{
			if (w.getLength() == size)
			{
				count++;
			}
		}

		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowels = 0;
		for (int i = 0; i < words.size(); i++)
		{
			if(words.get(i).getLength() == size)
			{
				vowels = vowels + words.get(i).getNumVowels();
				i = i - 1;
			}
		}
		
		/*for (Word w: words)
		{
			if (w.getLength() == size)
			{
				vowels = vowels + w.getNumVowels();
				words.remove(w);
			}
		}*/

		return vowels;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		for (Word w: words)
		{
			if (w.getNumVowels() == numVowels)
			{
				count++;
			}
		}

		return count;
	}
	
	public String toString()
	{
	   String output = "";
	   output = output + "[";
	   for (Word w: words)
	   {
		   output = output + w + ", ";
		   
	   }
	   output = output + "]";
		
	   return output;
	}
}