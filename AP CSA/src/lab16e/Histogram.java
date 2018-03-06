package lab16e;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	
	public Histogram()
	{

		fileName = "Lab16e1.dat";
		letters.add('a');


	}

	public Histogram(char[] values, String fName)
	{

		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		
		fileName = fName;
		for (int i = 0; i < values.length; i++)
		{
			letters.add(values[i]);
		}
		for (int i = 0; i < letters.size(); i ++)
		{
			count.add(0);
		}




		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		String fileContents = "";
		try{
			Scanner file = new Scanner (new File(System.getProperty("user.dir")+"\\src\\lab16e\\" + fileName));
			while (file.hasNext())
			{
				fileContents = fileContents + file.next();
			}
			
	
			for (int i = 0; i < letters.size(); i ++)
			{
				for (int j = 0; j < fileContents.length(); j++)
				{
					if (fileContents.charAt(j) == letters.get(i))
					{
						count.set(i, count.get(i) + 1);
					}
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("problem");
		}


	}

	public char mostFrequent()
	{

		
		int counter = 0;
		int index = 0;
		for (int i = 0; i < count.size(); i++)
		{
			if (count.get(i) > counter)
			{
				counter = count.get(i);
				index = i;
			}
		
		}
		return letters.get(index);
	}

	public char leastFrequent()
	{
		
		int counter = 100000000;
		int index = 0;
		for (int i = 0; i < count.size(); i++)
		{
			if (count.get(i) <counter)
			{
				counter = count.get(i);
				index = i;
			}
			
		}
		return letters.get(index);
	}

	

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}