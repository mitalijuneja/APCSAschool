package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = keyboard.nextInt();
		System.out.print("\nEnter b: ");
		int b = keyboard.nextInt();
		System.out.print("\nEnter c: ");
		int c = keyboard.nextInt();
		
		Quadratic testOne = new Quadratic(a, b, c);
		
		System.out.println();
		System.out.print("Enter a: ");
		a = keyboard.nextInt();
		System.out.print("\nEnter b: ");
		b = keyboard.nextInt();
		System.out.print("\nEnter c: ");
		c = keyboard.nextInt();
		
		Quadratic testTwo = new Quadratic(3,2,-7);
		
		System.out.println();
		System.out.print("Enter a: ");
		a = keyboard.nextInt();
		System.out.print("\nEnter b: ");
		b = keyboard.nextInt();
		System.out.print("\nEnter c: ");
		c = keyboard.nextInt();
		
		Quadratic testThree = new Quadratic (9,6,1);
   	
   	
		
		
	}
}