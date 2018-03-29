package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
		
	}

	//add the other Ball constructors
	
	public Ball (int x, int y, int w, int h)
	{
		super (x,y, w, h);
		setXSpeed (3);
		setYSpeed (1);
	}
	
	public Ball (int x, int y)
	{
		super (x, y);
		setXSpeed (3);
		setYSpeed (1);
	}
	
	public Ball (int x, int y, int w, int h, Color col)
	{
		super (x, y, w,h,col);
		setXSpeed (3);
		setYSpeed (1);
	}
	
	public Ball (int x, int y, int w, int h, Color col, int xSp, int ySp)
	{
		super (x, y, w, h, col);
		setXSpeed (xSp);
		setYSpeed (ySp);
	}
	
	

	   
   //add the set methods
	
	public void setXSpeed(int xSp)
	{
		xSpeed = xSp;
	}
	
	public void setYSpeed (int ySp)
	{
		ySpeed = ySp;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   Color currentColor = getColor();
	   draw(window, Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY() + ySpeed);

		//draw the ball at its new location
      draw(window, currentColor);
   }
   
	public boolean equals(Object obj)
	{
		Ball b = (Ball)obj;
		if (b.getHeight() == this.getHeight() && b.getWidth() == this.getWidth() && b.getX() == this.getX() && b.getY() == this.getY() && b.getColor() == this.getColor() && this.getXSpeed() == b.getXSpeed() && this.getYSpeed() == b.getYSpeed() )
		{
			return true;
		}

		return false;


	}   

   //add the get methods
	
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

   //add a toString() method
	public String toString()
	{
		String output = "";
		
		output = output + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}
}