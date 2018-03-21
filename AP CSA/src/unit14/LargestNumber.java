package unit14;
import java.util.Scanner;


public class LargestNumber {
	
	private int[] numbers;
	int largest;
	public LargestNumber(int[] n)
	{
		numbers = n;
		largest = numbers[0];
		
	}
	
	public int getLargest(int index)
	{
		
		if(numbers[index] > largest)
		{
			largest = numbers[index];
			
		}
		if (index == numbers.length - 1)
		{
			return largest;
		}
		return getLargest(index+1);
	}
	
	public String toString()
	{
		String output = "largest number = " + getLargest(0);
		return output;
	}
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many numbers would you like to enter? " );
		int size = keyboard.nextInt();
		
		int[] numbers = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("\nEnter number " + i + " : " );
			int n = keyboard.nextInt();
			numbers[i] = n;
		}
		
		LargestNumber test = new LargestNumber(numbers);
		System.out.println(test);
	}
}
