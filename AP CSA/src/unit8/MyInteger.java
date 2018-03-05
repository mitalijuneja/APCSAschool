package unit8;

public class MyInteger {

	int value;//data field, class properties, class variable
	
	public MyInteger(int number)
	{
		value = number;
	}
	
	public int getInt()
	{
		return value;
	}
	
	public boolean isEven()
	{
		if (value % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isOdd()
	{
		if (value % 2 == 0)
		{
			return false;
		}
		return true;
	}
	
	public boolean isPrime()
	{
		if (value == 2 && value == 1)
		{
			return true;
		}
		for (int i = 2; i < value; i++)
		{
			if (value % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int number)
	{
		if (number % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int number)
	{
		if (number % 2 == 0)
		{
			return false;
		}
		return true;
	}
	
	public boolean isPrime(int number)
	{
		if (number == 2 && number == 1)
		{
			return true;
		}
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		if (myInt.getInt() % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		if (myInt.getInt() % 2 == 0)
		{
			return false;
		}
		return true;
	}
	
	public boolean isPrime(MyInteger myInt)
	{
		if (myInt.getInt() == 2 && myInt.getInt() == 1)
		{
			return true;
		}
		for (int i = 2; i < myInt.getInt(); i++)
		{
			if (myInt.getInt() % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int number)
	{
		if (value == number)
		{
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger myInt)
	{
		if (value == myInt.getInt())
		{
			return true;
		}
		return false;
	}
	
	public static int parseInt(char[] characters)
	{
		int number = 0;
		int myInt = 0;
		for (int i = 0; i < characters.length; i++)
		{
			number = characters[i] - 48;
			myInt = myInt*10 + number;
		}
		return myInt;
	}
	
	public static int parseInt(String s)
	{
		int myInt = 0;
		char[] str = new char[s.length()];
		for (int i = 0; i < str.length; i++)
		{
			str[i] = s.charAt(i);
		}
		myInt = parseInt(str);
		return myInt;
	}
	
}
