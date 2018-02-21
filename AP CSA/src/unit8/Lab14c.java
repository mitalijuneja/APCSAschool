package unit8;

import java.util.Arrays;

public class Lab14c
{
	public static void main( String args[] )
	{
		//add test cases
		
		int[] test = {2,4,6,8,10,12,14};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(test)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(test)));
		System.out.println();
		
		int[] test1 = {1,2,3,4,5,6,7,8,9};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(test1)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(test1)));
		System.out.println();
		
		int[] test2 = {2,10,20,21,23,24,40,55,60,61};
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(test2)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(test2)));
		System.out.println();

	}
}
