package unit1;

import static java.lang.System.*;


public class starsAndStripes {
	public starsAndStripes()
	   {
	      out.println("StarsAndStripes");//no System.out because system is imported
	      printTwoBlankLines();
	   }

	public void printTwentyStars()
	   {
		out.println("********************");
	   }

	public void printTwentyDashes()
	   {
		out.println("--------------------");
	   }

	 public void printTwoBlankLines()
	   {
		 out.println();
		 out.println();
	   }
	   
	 public void printASmallBox()
	   {	
		 printTwentyDashes();
		 printTwentyStars();
		 printTwentyDashes();
		 printTwentyStars();
		 printTwentyDashes();
		 printTwentyStars();
		 printTwentyDashes();
	   }
	 
	 public void printABigBox()
	   { 
		 printASmallBox();
		 printASmallBox();
	   }   
	}

