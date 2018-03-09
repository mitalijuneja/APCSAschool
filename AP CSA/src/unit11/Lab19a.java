package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Lab19a
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);
		int height, weight, age;
		for(int i=0; i<size;i++)
		{
			//read in monster values 
	
			//ask for ht
			System.out.print("\nEnter height for this monster: ");
			height = keyboard.nextInt();
			
			//ask for wt
			System.out.print("Enter weight for this monster: ");
			weight = keyboard.nextInt();
			
			//ask for age
			System.out.print("Enter age for this monster: ");
			age = keyboard.nextInt();
			
			//instantiate a new Monster() and add it to the herd
			Monster myMonster = new Monster (height, weight, age);
			herd.add(i, myMonster);
			
			
		}		
		
		System.out.println("\nHERD :: "+herd+"\n");
		//print out the other stats
		System.out.println("SMALLEST: " + herd.getSmallest());
		System.out.println("LARGEST: " + herd.getLargest());
		
		System.out.println("\nHERD :: "+herd+"\n");

		
		
			
	}		
}