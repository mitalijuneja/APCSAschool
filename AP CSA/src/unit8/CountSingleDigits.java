package unit8;
import java.util.Random;

public class CountSingleDigits {
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] arr = {0,0,0,0,0,0,0,0,0,0};
		int number = 0;
		int count = 0;
		while (count <= 99)
		{
			number = r.nextInt(10);
			arr[number] = arr[number] + 1;
			count++;
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("number of " + i+"s = " + arr[i]);
		}
	}

}
