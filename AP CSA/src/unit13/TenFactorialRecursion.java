package unit13;

public class TenFactorialRecursion {
	int number;
	int factorial;
	public TenFactorialRecursion(int n)
	{
		number = n;
		factorial = 1;
		factorial (number, factorial);
	}
	
	public int factorial(int n, int f)
	{
		int number = n;
		int factorial = f;
		factorial = factorial * number;
		number--;
		if (number ==0)
		{
			return factorial;
		}
		else
		{
			return factorial(number, factorial);
		}
		
	}
	
	public static void main(String[] args)
	{
		TenFactorialRecursion test = new TenFactorialRecursion(10);
	}

}
