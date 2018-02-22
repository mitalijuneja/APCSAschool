package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	double[] grades;
	
	

	//constructor
	public Grades(double[] g)
	{
		setGrades(g);
	}



	//set method
	public void setGrades(double[] g)
	{
		grades = g;

	}



	private double getSum()
	{
		double sum=0.0;
		for (double x:grades )
		{
			sum = sum + x;
		}



		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/grades.length;



		return average;
	}


	//toString method
	public String toString()
	{
		String output = "";
		for (int i = 0; i<grades.length; i++)
		{
			output = output + "grade " + i + " = " + grades[i] + "\n";
		}
		
		return output;
	}



}