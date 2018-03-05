package lab16d;

import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		//make a new MadLib
		System.out.println(System.getProperty("user.dir"));
		//make a new MadLib
		String madLibFile = "\\src\\lab16d\\madlib.dat";
		MadLib mad = new MadLib(madLibFile);
		
		out.println("\n");
	}
}