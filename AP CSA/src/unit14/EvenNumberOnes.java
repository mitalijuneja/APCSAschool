package unit14;
import java.util.Random;
public class EvenNumberOnes {
	public static void main(String[] args)
	{
		int[][] a = new int[6][6];
		Random r = new Random();
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				a[i][j] = r.nextInt(2);
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		int rCount = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j =0; j < a[i].length; j++)
			{
				if (a[i][j] == 1)
				{
					rCount++;
				}
			}
			if (rCount %2 == 0)
			{
				System.out.println("row " + i + " has an even number of 1s");
			}
			else
			{
				System.out.println("row " + i + " has an odd number of 1s");
			}
			rCount =0;
		}
		
		int cCount = 0;
		for (int j = 0; j < a.length; j++)
		{
			for (int i = 0; i < a.length; i++)
			{
				if (a[i][j] == 1)
				{
					cCount++;
				}
			}
			if (cCount %2 ==0)
			{
				System.out.println("column" + j + " has an even number of 1s");
			}
			else
			{
				System.out.println("column" + j + " has an odd number of 1s");
			}
			cCount = 0;
		}
	}

}
