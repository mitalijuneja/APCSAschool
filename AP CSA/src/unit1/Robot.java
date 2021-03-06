package unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      
      //call other methods
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);


		//add more code here
      window.setColor(Color.MAGENTA);
      window.fillOval(340, 130, 20, 20);
      window.fillOval(440, 130, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(385, 160, 30, 15);
      window.setColor(Color.BLUE);
      window.drawArc(350, 160, 100, 30, 0, -180);
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.GREEN);
	   window.fillRect(340,220,120,90);
	   window.setColor(Color.ORANGE);
	   window.drawLine(340, 225, 300, 190);
	   window.drawLine(460, 225, 500, 190);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.CYAN);
	   window.fillRect(340,320,120,90);
	   window.setColor(Color.ORANGE);
	   window.drawLine(340, 405, 300, 440);
	   window.drawLine(460, 405, 500, 440);
   }
}
