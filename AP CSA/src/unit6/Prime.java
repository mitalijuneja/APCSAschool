package unit6;

public class Prime
{
	private int number;

	public Prime()
	{

		number = 0;
	}

	public Prime(int num)
	{

		setPrime(num);
	}

	public void setPrime(int num)
	{

		number = num;
	}

	public boolean isPrime()
	{
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				return true;
			}
		}

		return false;
	}

	public String toString()
	{
		String output="";
		if (isPrime())
		{
			output = number + " is prime.";
		}
		else
		{
			output = number + "is not prime.";
		}

		return output;
	}
}
