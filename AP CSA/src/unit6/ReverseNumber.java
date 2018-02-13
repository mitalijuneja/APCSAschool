package unit6;

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
   public ReverseNumber()
   {
	   number = 0;
   }
   public ReverseNumber(int n)
   {
	   setNumber(n);
   }
	
	
	//add a set method
   public void setNumber(int n)
   {
	   number = n;
   }


	public int getReverse()
	{
		int rev=0;
		
		int num = number;
		
		while (num > 0)
		{
			rev = rev *10 + num%10;//get the last digit
			//original = 234
			//rev = 4
			//rev = 40+3= 43
			//rev = 43* 10+2 = 432
			num = num/10;//cuts off last digit
		}



		
		return rev;
	}

	//add  a toString
	public String toString()
	{
		return number + " reversed is " + getReverse();
	}
	
	
}