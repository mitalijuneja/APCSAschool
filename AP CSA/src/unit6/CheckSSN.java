package unit6;

import java.util.Scanner;
public class CheckSSN {
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter social security number: ");
		String ssn = keyboard.nextLine();
		
		int x = 0;
		for (int i = 0; i < ssn.length(); i++)// or can do with while loop - declare c = 0 outside loop, condition inside loop, and increment inside loop
		{
			if (i == 3 || i == 6)
			{
				continue;
			}
			if (ssn.charAt(i) >=48 && ssn.charAt(i) <=57)
			{
				x++;
			}
		}
		if (x == 9)
		{
			if ((ssn.charAt(3) == '-') && (ssn.charAt(6) == '-'))
			{
				System.out.println("Valid input");
			}
			else
			{
				System.out.println("Invalid input");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}

}
