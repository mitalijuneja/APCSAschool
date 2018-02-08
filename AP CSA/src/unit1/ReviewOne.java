package unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class ReviewOne extends Canvas{
	public ReviewOne()    //constructor - sets up the class
	   {
	      setSize(800,600);
	      setBackground(Color.WHITE);
	      setVisible(true);
	   }

	   public void paint( Graphics window )
	   {
	      Rectangle(window);
	   }

	   public void Rectangle( Graphics window )
	   {
	      window.setColor(Color.BLUE);
	      window.drawRect (10,10,6,7);
	      window.drawRect(50, 50, 10, 11);
			//add more code here


	   }
	   public void lengthWidth()
	   {
		  System.out.println("Perimeter of 42: ");
		  System.out.println("Width = 10, Height = 11");
		  System.out.println();
		  System.out.println("Area of 42: ");
		  System.out.println("Width = 6, Height = 7");
	   }

}
