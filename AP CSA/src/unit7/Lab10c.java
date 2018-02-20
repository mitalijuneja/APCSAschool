package unit7;

import static java.lang.System.*;

public class Lab10c
{
	public static void main(String args[])
	{
		//add test cases
		BiggestString test = new BiggestString("abc", "cba", "bca");
		System.out.println(test + "\n");
		
		BiggestString test2 = new BiggestString ("one", "fourteen", "twenty");
		System.out.println(test2 + "\n");
		
		BiggestString test3 = new BiggestString ("124323", "20009", "3434");
		System.out.println(test3 + "\n");
		
		BiggestString test4 = new BiggestString ("abcde", "ABCDE", "1234234324");
		System.out.println(test4 + "\n");


	}
}
