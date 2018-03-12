package unit11;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		Grades newGrades = new Grades(gradeList);
		myGrades = newGrades;
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);	
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		double average = getSum()/getNumGrades();
		return average;
	}

	public double getAverageMinusLow()
	{
		double sumMinusLow = getSum() - getLowGrade();
		double average = sumMinusLow/(getNumGrades() - 1);
		return average;
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return myName + " = " + myGrades;
	}	
}