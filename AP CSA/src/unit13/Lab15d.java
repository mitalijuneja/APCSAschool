package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(System.getProperty("user.dir") +"\\src\\unit13\\lab15d.dat" );//File.separator + "src" + File.separator + "unit11" + File.separator+ "gradebook.dat"
		String[] sentences = new String[file.nextInt()];
		file.nextLine();
		for (int i = 0; i < sentences.length; i++)
		{
			sentences[i] = file.nextLine();
		}
		System.out.println(Arrays.toString(sentences));





	}
}