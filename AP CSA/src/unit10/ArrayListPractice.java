package unit10;

import java.util.Arrays;

public class ArrayListPractice {
	
	static int[] numbers = {2,3,4};//reference variable (use built in methods to print)
	static int num = 8;//primitive variable (can access/print directly)
	static Integer number = new Integer(5);
	

	
	public static void main (String[] args)
	{
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers);
		System.out.println(number);
		int[] temp = numbers;//point to numbers
		temp[0] = 9;
		System.out.println(Arrays.toString(temp));
		System.out.println(temp);
		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
