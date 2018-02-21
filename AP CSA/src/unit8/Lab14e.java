package unit8;

public class Lab14e
{
	public static void main(String args[])
	{
		//add test cases
		int[] testArr = {1,5,3,4,5,5,5,4,3,2,5,5,5,3};
		Histogram test = new Histogram(testArr);
		System.out.println(test);
		
		int[] testArr2 = {2,3,4,5,6,7,8,9,0,2,3,5,6,8,8,8,9,4,5};
		Histogram test2 = new Histogram(testArr2);
		System.out.println(test2);
		
		int[] testArr3 = {2,3,4,5,6,7,8,2,0,2,3,5,6,8,8,8,9,4, 5};
		Histogram test3 = new Histogram(testArr3);
		System.out.println(test3);
		
		
		
		
		
	}
}
