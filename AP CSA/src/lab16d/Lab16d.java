package lab16d;

import static java.lang.System.*;

import java.io.File;
import java.util.Scanner;

public class Lab16d
{
	public static void main( String args[] )
	{
		//make a new MadLib
		System.out.println(System.getProperty("user.dir"));
		//make a new MadLib
		String madLibFile = "\\src\\lab16d\\story.dat";
		MadLib mad = new MadLib(madLibFile);
		try{
		Scanner file = new Scanner (new File(System.getProperty("user.dir")+"\\src\\lab16d\\story.dat"));
		
		String word = "";
		String output = "";
		while(file.hasNext())
		{
			word = file.next();
			if (word.equals("&") || word.equals("#") || word.equals("@"))
			{
				if (word.equals("&"))
				{
					output = output+mad.getRandomAdjective() + " ";
				}
				else if (word.equals("#"))
				{
					output = output+mad.getRandomNoun() + " ";
				}
				else if (word.equals("@"))
				{
					output = output + mad.getRandomVerb() + " ";
				}
			}
			else
			{
				output = output + word + " ";
			}
		}
		System.out.println(output);
		out.println("\n");
		}
		catch(Exception e)
		{
			System.out.println("problem");
		}
		
	}
}