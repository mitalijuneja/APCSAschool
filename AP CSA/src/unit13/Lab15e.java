package unit13;

public class Lab15e {

	public static void main(String[] args)
	{
		NumberSort tester = new NumberSort();
		int[] tester1 = tester.getSortedDigitArray(567891);
		for (int i = 0; i < tester1.length; i++)
		{
			System.out.print(tester1[i] + " ");
		}
		
		int[] tester2 = tester.getSortedDigitArray(901912468);
		System.out.println();
		for (int i = 0; i< tester2.length; i++)
		{
			System.out.print(tester2[i] + " ");
			
		}
		
		int[] tester3 = tester.getSortedDigitArray(864213507);
		System.out.println();
		for (int i = 0; i<tester3.length; i++)
		{
			System.out.print(tester3[i] + " ");
		}
	}
}
