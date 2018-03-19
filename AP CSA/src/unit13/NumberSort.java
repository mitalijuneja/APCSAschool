package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0)
		{
			number = number/10;
			count++;
		}


		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int index = 0;
		int digit = 0;
		while(number > 0)
		{
			digit = number%10;
			number = number/10;
			sorted[index] = digit;
			index++;
		}
		Arrays.sort(sorted);
		
		

		return sorted;
	}
}
