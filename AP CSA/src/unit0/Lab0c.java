package unit0;//first line = package


import static java.lang.System.*;//* = import everything 
import java.util.Scanner;//Scanner class

public class Lab0c
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		byte byteOne;
		long longOne;


		System.out.print("Enter an integer : ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer : ");
		intTwo = keyboard.nextInt();


		//add in input for all variables
		System.out.print("Enter a short: " );
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a short: ");
		shortTwo = keyboard.nextShort();

		System.out.print("Enter a double: " );
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a double: ");
		doubleTwo = keyboard.nextDouble();
		
		System.out.println("Enter a float: ");
		floatOne = keyboard.nextFloat();
		
		System.out.println("Enter a float: ");
		floatTwo = keyboard.nextFloat();

		System.out.println("Enter a byte: ");
		byteOne = keyboard.nextByte();
		
		System.out.println("Enter a long: ");
		longOne = keyboard.nextLong();




		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		
		
		//add in output for all variables

		System.out.println("short one = " + shortOne);
		System.out.println("short two =  " + shortTwo);
		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);
		System.out.println("float one = " + floatOne);
		System.out.println("float two = " + floatTwo);
		System.out.println("byte one = " + byteOne);
		System.out.println("long one = " + longOne);






	}
}
