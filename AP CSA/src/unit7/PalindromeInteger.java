package unit7;
import java.util.Scanner;

public class PalindromeInteger {
	public static int reverse(int n)
	{
		int reverse = 0;
		while (n > 0)
		{
			reverse = (reverse*10) + (n%10);
			n = n/10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int n)
	{
		if (n == reverse(n))
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = keyboard.nextInt();
		if (isPalindrome(number))
		{
			System.out.println(number + " is a palindrome.");
		}
		else
		{
			System.out.println(number + " is not a palindrome.");
		}
	}

}
