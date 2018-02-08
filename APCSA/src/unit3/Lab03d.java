package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter X1: ");
		int x1 = keyboard.nextInt();
		System.out.print("\nEnter Y1: ");
		int y1 = keyboard.nextInt();
		System.out.print("\nEnter X2: " );
		int x2 = keyboard.nextInt();
		System.out.print("\nEnter Y2: ");
		int y2 = keyboard.nextInt();
		
		
		Distance dOne = new Distance (x1,y1,x2,y2);
		
		System.out.println();
		System.out.print("Enter X1: ");
		x1 = keyboard.nextInt();
		System.out.print("\nEnter Y1: ");
		y1 = keyboard.nextInt();
		System.out.print("\nEnter X2: " );
		x2 = keyboard.nextInt();
		System.out.print("\nEnter Y2: ");
		y2 = keyboard.nextInt();
		
		Distance dTwo = new Distance (x1,y1,x2,y2);
		
		System.out.println();
		System.out.print("Enter X1: ");
		x1 = keyboard.nextInt();
		System.out.print("\nEnter Y1: ");
		y1 = keyboard.nextInt();
		System.out.print("\nEnter X2: " );
		x2 = keyboard.nextInt();
		System.out.print("\nEnter Y2: ");
		y2 = keyboard.nextInt();
		
		Distance dThree = new Distance (x1,y1,x2,y2);
		
		
			
	}
}