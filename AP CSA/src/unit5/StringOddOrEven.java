package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{

		word = s;
		word = word.trim();
	}

 	public boolean isEven()
 	{
 		if (word.length() % 2 ==0){
 			return true;
 		}


		return false;
	}

 	public String toString()//string representation of the object
 	{
 		String output="";

 		if (isEven())
		{
			output = word + " is even.";
		}
		else
		{
			output = word + " is odd.";
		}



 		return output;
	}
}