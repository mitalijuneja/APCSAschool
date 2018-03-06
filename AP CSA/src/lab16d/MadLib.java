package lab16d;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random;
public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{

		

	}

	public MadLib(String fileName)
	{
		//load stuff
		System.out.println("TEST");
		verbs = new ArrayList();
		loadVerbs();
		
		nouns = new ArrayList();
		loadNouns();
		
		adjectives = new ArrayList();
		loadAdjectives();
		
		
		try{
			
			Scanner file = new Scanner(new File(fileName));
		
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!\n");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file2 = new Scanner (new File(System.getProperty("user.dir")+"\\src\\lab16d\\nouns.dat"));
			while(file2.hasNextLine())
			{
				nouns.add(file2.nextLine());
			}
		
		
		
		
		
		}
		catch(Exception e)
		{
			out.println(e);
		}	
		
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner (new File(System.getProperty("user.dir")+"\\src\\lab16d\\verbs.dat"));
			while (file.hasNextLine())
			{
				verbs.add(file.nextLine());
			}
	
	
	
	
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		System.out.println(verbs.get(0));
		System.out.println(verbs.get(5));
	}

	public void loadAdjectives()
	{
		try{
			Scanner file1 = new Scanner (new File(System.getProperty("user.dir")+"\\src\\lab16d\\adjectives.dat"));
			while(file1.hasNextLine())
			{
				adjectives.add(file1.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

	public String getRandomVerb()
	{
		Random r = new Random();
		int number = r.nextInt(verbs.size() + 1);
		return verbs.get(number);
	}
	
	public String getRandomNoun()
	{
		Random r = new Random();
		int number = r.nextInt(nouns.size() + 1);
		return nouns.get(number);
		
	}
	
	public String getRandomAdjective()
	{
		Random r = new Random();
		int number = r.nextInt(adjectives.size() + 1);
		return adjectives.get(number);

	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}