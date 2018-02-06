package unit1;

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		//finish this constructor
		yPos = y;
		width = wid;
		height = ht;
		color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.drawRect(xPos, yPos, width, height);
      window.fillOval(xPos + width/2, yPos +height/2, width/2, height/2);
      window.drawArc(xPos, yPos, width, height, 0, 180);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()
      

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}
