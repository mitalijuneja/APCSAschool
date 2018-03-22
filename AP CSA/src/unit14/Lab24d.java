package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "unit14" + File.separator + "lab24d.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		for (int i = 1; i <=size; i++)
		{
			TicTacToe test = new TicTacToe (file.nextLine());
			System.out.println(test);
			
		}








	}
}


