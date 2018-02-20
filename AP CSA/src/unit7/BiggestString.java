package unit7;

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings (a,b,c);

	}

	public void setStrings(String a, String b, String c)
	{

		one = a;
		two = b;
		three = c;

	}

	public String getBiggest()
	{
		String biggest = one;
		if (biggest.compareTo (two) < 0)
		{
			biggest = two;
		}
		if (biggest.compareTo (three) < 0)
		{
			biggest = three;
		}


		return biggest;
	}

	public String toString()
	{
	   return one + " " + two + " " + three +"\nbiggest = " + getBiggest();
	}
}