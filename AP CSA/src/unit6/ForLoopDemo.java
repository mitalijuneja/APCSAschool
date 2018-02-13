package unit6;

import static java.lang.System.*;

public class ForLoopDemo
{
	//instance variables and constructors could be used, but are not really needed
	
	//runForLoop() will run a for loop from start to stop going up by increment
	public static void runForLoop(int start, int stop, int increment )
	{
		System.out.println("start " + start + " : stop " + stop + " : increment " + increment);
		for (int i = start; i<stop; i = i+ increment )
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();



	}
}
