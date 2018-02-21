package unit8;

import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array)
	{
		int even = 0;
		for (int x:array)
		{
			if (x % 2 == 0)
			{
				even++;
			}
		}
		return even;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int[] evenArr = new int[countEm(array)];
		int index = 0;
		for (int x: array)
		{
			if (x % 2 == 0)
			{
				evenArr[index] = x;
				index++;
			}
		}
		return evenArr;
	}

	public static int[] getAllOdds(int[] array)
	{
		int[] oddArr = new int[array.length - countEm(array)];
		int index = 0;
		for (int x: array)
		{
			if (x % 2 != 0)
			{
				oddArr[index] = x;
				index++;
			}
		}
		return oddArr;		
	}
}
