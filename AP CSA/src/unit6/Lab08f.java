package unit6;


import static java.lang.System.*;
import java.util.Scanner;

public class Lab08f
{
	public static void main ( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String userWord = keyboard.nextLine();
		Word test = new Word (userWord);
		System.out.println(test);
		
		System.out.print("Enter a word: ");
		userWord = keyboard.nextLine();
		Word testOne = new Word (userWord);
		System.out.println(testOne);
		
		System.out.print("Enter a word: ");
		userWord = keyboard.nextLine();
		Word testTwo = new Word (userWord);
		System.out.println(testTwo);
		
		System.out.print("Enter a word: ");
		userWord = keyboard.nextLine();
		Word testThree = new Word (userWord);
		System.out.println(testThree);
		
		System.out.print("Enter a word: ");
		userWord = keyboard.nextLine();
		Word testFour = new Word (userWord);
		System.out.println(testFour);
		
		
		
		
		
		
	}
}
