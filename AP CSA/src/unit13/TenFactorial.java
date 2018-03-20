package unit13;

public class TenFactorial {
	public static void main(String[] args)
	{
		int number = 10;
		int factorial = 1;
		for (int i = number; i > 0; i--)
		{
			factorial = factorial * i;
		}
		System.out.println("10! = " + factorial);
	}

}
