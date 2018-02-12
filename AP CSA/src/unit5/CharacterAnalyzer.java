package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 'm';
	}

	public CharacterAnalyzer(char c)
	{

		setChar(c);
	}

	public void setChar(char c)
	{

		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar >=65 && theChar < 97)
		{
			return true;
		}


		return false;
	}

	public boolean isLower( )
	{

		if (theChar >=97)
		{
			return true;
		}

		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar >=48 && theChar <=58)
		{
			return true;
		}


		return false;
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{

		if (isUpper())
		{
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n"; 
		}
		
		else if (isNumber())
		{
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}


		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
}