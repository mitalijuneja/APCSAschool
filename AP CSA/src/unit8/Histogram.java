package unit8;

import java.util.Scanner;

public class Histogram
{
	private int[] numCount;

	//constructor
	public Histogram(int[] arr)
	{
		setArray(arr);
	}

	//set method
	public void setArray(int[] arr)
	{
		numCount = arr;
	}

	//toString method
	public String toString()
	{
		int count = 0;
		String output = "";
		for (int i = 0; i < 10; i++)
		{
			for(int x: numCount)
			{
				if (x == i)
				{
					count++;
				}
			}
			output = output + i + " - " + count + "\n";
			count = 0;
		}
		return output;
	}
}
