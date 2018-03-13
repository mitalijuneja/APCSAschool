package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\n\nWhat is the name of this class? ");
		String className = keyboard.nextLine();
		
		System.out.print("\nHow many students are in this class? ");
		int classSize = keyboard.nextInt();
		
		
		Class newClass = new Class (className, classSize);
		keyboard.nextLine();
		
		for (int i = 1; i < classSize + 1; i++)
		{
			System.out.print("\nEnter the name of student " + i + ": ");
			String studentName = keyboard.nextLine();
			
			System.out.println("Enter the grades for " + studentName);
			System.out.print("Use the format x - grades ( 2 - 100 100): ");
			String gradesList = keyboard.nextLine();
			Student newStudent = new Student (studentName, gradesList);
			newClass.addStudent(i -1, newStudent);
		}
		out.println(newClass);
		
		out.println(String.format(newClass.getStudentName(0) + "\'s average = %.2f",newClass.getStudentAverage(0)));	
		out.println(String.format(newClass.getStudentName(1) + "\'s average = %.2f",newClass.getStudentAverage(1)));	
		out.println(String.format(newClass.getStudentName(2) + "\'s average %.2f",newClass.getStudentAverage(2)));	
		out.println(String.format(newClass.getStudentName(3) + "\'s average %.2f",newClass.getStudentAverage(3)));	
		out.println(String.format(newClass.getStudentName(4) + "\'s average %.2f",newClass.getStudentAverage(4)));	

		

		out.println("Failure List = " + newClass.getFailureList(70));	
		out.println("Highest Average = " + newClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + newClass.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",newClass.getClassAverage()));	




















	}		
}