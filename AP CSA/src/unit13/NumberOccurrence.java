package unit13;

import java.util.Arrays;
import java.util.Random;

public class NumberOccurrence {
	
	static int [] numbers = new int[100];
	
	public void fillArray()
	{
		int n = 0;
		Random r = new Random();
		for (int i = 0; i < numbers.length; i++)
		{
			n = r.nextInt(100) + 1;
			numbers[i] = n;
		}
	}
	public void linearSearch()
	{
		
		System.out.println("LINEAR SEARCH");
		long startTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 1; i <= 100; i++)
		{
			for (int j = 0; j < numbers.length; j++)
			{
				if (i == numbers[j])
				{
					count++;
				}
				
			}
			System.out.println(i + " count = " + count);
			long stopTime = System.currentTimeMillis();
			double elapsedTime = stopTime - startTime;
			System.out.println("time = " + elapsedTime + " ms");
			count = 0;
		}
	}
	
	public void binarySearch()
	{
		System.out.println("\nBINARY SEARCH");
		Arrays.sort(numbers);
		int count1 = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 100; i++)
		{
			int index = 0;
			index =Arrays.binarySearch(numbers, i);
			while (index >= 0)
			{
				count1++;
				int[] number1 = new int[numbers.length - 1];
				for (int j = 0; j < index; j++)
				{
					number1[j] = numbers[j];
				}
				for (int k = index + 1; k < numbers.length; k++)
				{
					number1[k - 1] = numbers[k];
				}
				numbers = number1;
				index = Arrays.binarySearch(numbers, i);
			}
			System.out.println(i + " count = " + count1);
			long stopTime = System.currentTimeMillis();
			double elapsedTime = stopTime - startTime;
			System.out.println("time = " + elapsedTime + " ms");
			count1 = 0;
		}
	}
	public static void main(String[] args)
	{
		NumberOccurrence test = new NumberOccurrence();
		test.fillArray();
		test.linearSearch();
		test.binarySearch();
	
	}
}
	


