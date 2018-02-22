package unit8;

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		double[] arr1 = {100,90,85,72.5,95.6};
		Grades test1 = new Grades(arr1);
		System.out.println(test1 + "\n");
		System.out.printf("average = %.2f\n\n", test1.getAverage());

		double[] arr2 = {50.0, 100.0,80.0};
		Grades test2 = new Grades (arr2);
		System.out.println(test2 + "\n");
		System.out.printf("average = %.2f\n\n", test2.getAverage());
		
		double[] arr3 = {93.4, -90.0, 90.0};
		Grades test3 = new Grades (arr3);
		System.out.println(test3 + "\n");
		System.out.printf("average = %.2f\n\n", test3.getAverage());
		
		double[] arr4 = {1,2,3,4,5,6,7,8,9};
		Grades test4 = new Grades (arr4);
		System.out.println(test4 + "\n");
		System.out.printf("average = %.2f\n\n", test4.getAverage());
		
		
		
	}
}