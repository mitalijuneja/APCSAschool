package unit7;

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{

		setDoubles(a,b,c,d);

	}

	public void setDoubles(double a, double b, double c, double d)
	{

		one = a;
		two = b;
		three = c;
		four = d;

	}

	public double getBiggest()
	{

		double biggest = one;
		if (biggest < two)
		{
			biggest = two;
		}
		if (biggest < three)
		{
			biggest = three;
		}
		if (biggest < four)
		{
			biggest = four;
		}
		return biggest;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four +"\nbiggest = " + getBiggest();
	}
}