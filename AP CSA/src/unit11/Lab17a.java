package unit11;

import static java.lang.System.*;
import java.lang.Math;
import java.util.Arrays;

public class Lab17a
{
	public static void main( String args[] )
	{
	   int[] theRay = {2,4,6,8,10,12,8,16,8,20,8,4,6,2,2};
	   
	   out.println("Original array : "+Arrays.toString(theRay));
	   
	   out.println("Sum of 0-3: "+ArrayTools.sumSection(theRay,0,3));
	   
	   //add more test cases
	   
	   int[] array1 = {1,2,3,4,2,3,4,5,3,2,1};
	   System.out.println("\nOriginal array: " + Arrays.toString(array1));
	   System.out.println("Sum of 2-5: " + ArrayTools.sumSection(array1, 2, 5));
	   System.out.println("Count of 2s: " + ArrayTools.countVal(array1, 2));
	   	   
	}
}