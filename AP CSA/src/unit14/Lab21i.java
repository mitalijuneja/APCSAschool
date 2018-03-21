package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File (System.getProperty("user.dir") + File.separator + "src" + File.separator + "unit14" + File.separator + "lab21i.dat"));
		while (file.hasNextLine())
		{
			int size = file.nextInt();
			file.nextLine();
			String maze = file.nextLine();
			
			Maze test = new Maze(size, maze);
			test.hasExitPath(0, 0);
			System.out.println(test);
		}
		
	}
}