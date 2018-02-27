package unit8;
import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {

	public static int[] eliminateDuplicates(int[]list)
	{
		int count = list.length;
		int c = 0;
		for (int i = 1; i < list.length; i++)
		{
			for (int j = 0;j < i; j++)
			{
				
				if (list[i] == list[j] && j!=i)
				{
					c++;
				}
				
			}
			if (c > 0)
			{
				count = count - 1;
			}
			c = 0;
			System.out.println(count);
			
			
		}
		
		int[] newList = new int[count];
		int index = 0;
		int counter = 0;
		for (int i = 0; i < list.length; i++)
		{
			for (int j = 0; j < newList.length; j++)
			{
				if (newList[j] == list[i])
				{
				counter++;
				}
				if (counter == 0)
				{
					newList[j] = list[i];
				}
			}
		}
		return newList;
	}

	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		int n = 0;
		int[] numberArr = new int[10];
		for (int i = 0; i < numberArr.length; i++)
		{

			n = keyboard.nextInt();
			numberArr[i] = n;
		}
		System.out.println(Arrays.toString(numberArr));
		System.out.println("The distinct numbers are " + Arrays.toString(eliminateDuplicates(numberArr)) );
	}
	

}
