package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A
		System.out.println();

		//add more test cases
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testOne = new CharacterAnalyzer(letter);
		System.out.println(testOne);
		System.out.println();
		
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testTwo = new CharacterAnalyzer(letter);
		System.out.println(testTwo);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testThree = new CharacterAnalyzer(letter);
		System.out.println(testThree);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testFour = new CharacterAnalyzer(letter);
		System.out.println(testFour);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testFive = new CharacterAnalyzer(letter);
		System.out.println(testFive);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testSix = new CharacterAnalyzer(letter);
		System.out.println(testSix);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testSeven = new CharacterAnalyzer(letter);
		System.out.println(testSeven);
		System.out.println();
		
		System.out.print("Enter a letter: ");
		letter = keyboard.nextLine().charAt(0);
		CharacterAnalyzer testEight = new CharacterAnalyzer(letter);
		System.out.println(testEight);
		System.out.println();
		
		
		
		
		
		
		
		

	}
}