package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String userWord = keyboard.nextLine();
		
		StringOddOrEven test = new StringOddOrEven(userWord);
		System.out.println(test);
		
		
	}
}
