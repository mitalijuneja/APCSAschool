package unit6;


import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover testOne = new LetterRemover("I am Sam I am", 'a');
		System.out.println(testOne + "\n");
		
		LetterRemover testTwo = new LetterRemover ("ssssssssxssssesssssesss", 's');
		System.out.println(testTwo + "\n");
		
		LetterRemover testThree = new LetterRemover ("qwertyqwertyqwerty", 'a');
		System.out.println(testThree + "\n");
		
		LetterRemover testFour = new LetterRemover ("abababababa", 'b');
		System.out.println(testFour + "\n");
		
		LetterRemover testFive = new LetterRemover ("abaababababa", 'x');
		System.out.println(testFive + "\n");
		
											
	}
}