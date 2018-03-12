package unit11;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.length; i ++)
		{
			classAverage = classAverage + getStudentAverage(i);
		}
		classAverage = classAverage/studentList.length;
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int index = 0;
		for (int i = 0; i < studentList.length; i++)
		{
			if (stuName.equals(getStudentName(i)))
			{
				index = i;
				break;
			}
		}
		return studentList[index].getAverage();

	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i < studentList.length; i++)
		{
			if (getStudentAverage(i) > high)
			{
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lName ="";	
		for (int i = 0; i < studentList.length; i++)
		{
			if ( getStudentAverage(i) < low)
			{
				low = getStudentAverage(i);
				lName = getStudentName(i);
			}
		}

		return lName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getAverage() < failingGrade)
			{
				output = output + getStudentName(i) + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";




		return output;
	}  	
}