package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y)
   {
	   super(x, y);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int s)
   {
	   super (x, y);
	   setSpeed(s);
   }
   
   public Paddle (int x, int y, int w, int h)
   {
	   super (x, y, w, h);
	   setSpeed(5); 
   }
   
   public Paddle (int x, int y, int w, int h, int s)
   {
	   super (x, y, w, h);
	   setSpeed(s);
   }
   
   public Paddle (int x, int y, int w, int h, Color col, int s)
   {
	   super (x,y,w,h);
	   setSpeed (s);
	   setColor (col);
   }


   public void moveUpAndDraw(Graphics window)
   {
	   Color currentColor = getColor();
	   draw(window, Color.white);
	   setY(getY() + speed);
	   draw(window, currentColor);
	   
   }

   public void moveDownAndDraw(Graphics window)
   {
	   Color currentColor = getColor();
	   draw(window, Color.white);
	   setY(getY() - speed);
	   draw(window, currentColor);

   }
   
   public void setSpeed(int s)
   {
	   speed = s;
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   
   //add a toString() method
   
   public String toString()
   {
	   String output = getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
	   return output;
   }
}