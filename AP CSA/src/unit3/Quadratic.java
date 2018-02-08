package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
		rootOne = 0;
		rootTwo = 0;
		
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
		calcRoots();
		print();

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		rootOne = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
		rootTwo = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));

	}

	public void print( )
	{
		out.printf("Root One: %.2f\n", rootOne);
		out.printf("Root Two: %.2f\n", rootTwo);
		out.println();
		
	}
}