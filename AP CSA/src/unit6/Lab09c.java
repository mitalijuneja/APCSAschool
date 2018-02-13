package unit6;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab09c
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = keyboard.nextInt();
		ReverseNumber testOne = new ReverseNumber(number);
		System.out.println(testOne);
		
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();
		ReverseNumber testTwo = new ReverseNumber(number);
		System.out.println(testTwo);
		
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();
		ReverseNumber testThree = new ReverseNumber(number);
		System.out.println(testThree);
		
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();
		ReverseNumber testFour = new ReverseNumber(number);
		System.out.println(testFour);
		
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();
		ReverseNumber testFive = new ReverseNumber(number);
		System.out.println(testFive);
		
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();
		ReverseNumber testSix = new ReverseNumber(number);
		System.out.println(testSix);
		
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();
		ReverseNumber testSeven = new ReverseNumber(number);
		System.out.println(testSeven);
	}
}