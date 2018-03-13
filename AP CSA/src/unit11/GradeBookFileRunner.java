package unit11;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		//try{
			Scanner file = new Scanner(System.getProperty("user.dir") +"\\src\\unit11\\gradebook.dat" );//File.separator + "src" + File.separator + "unit11" + File.separator+ "gradebook.dat"
			while (file.hasNextLine())
			{
				System.out.println(file.nextLine());
				System.out.println("1");
			}
			/*System.out.println(file);
			String className = file.nextLine();
			System.out.println(className);
			//file.nextLine();
			int classSize = file.nextInt();
			file.nextLine();
		
			Class newClass = new Class (className, classSize);
			System.out.println(file.nextLine());
			
			for (int i = 1; i < classSize + 1; i++)
			{
				String studentName = file.nextLine();
				String gradesList = file.nextLine();
				
				Student newStudent = new Student (studentName, gradesList);
				newClass.addStudent(i -1, newStudent);
			//}
			
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
		//}
		/*catch (Exception e)
		{
			System.out.println("Problem");
		}*/
		
	













	}		
}

