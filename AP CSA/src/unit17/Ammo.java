package unit17;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super(x, y);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.fillRect(getX(), getY(), 10, 10);
	}
	
	public void collideDraw (Graphics window)
	{
		window.setColor(Color.BLACK);
		draw(window);
	}
	
	public boolean offScreen()
	{
		return this.getX() < 0 || this.getX() > 790 || this.getY() < 0 || this.getY() > 630;
	}
	
	
	
	public boolean collide(Object object)
	{
		MovingThing c = (MovingThing)object;
		if ((this.getX() + 10 >= c.getX()) && (this.getX() <=c.getX() + 80) && (this.getY() <= c.getY() + 80) && (this.getY() + 10 >= c.getY()))
		{
			return true;
		}
		return false;
	}	

	public String toString()
	{
		return "x = " + getX() + "y = " + getY() + "speed = " + getSpeed() ;
	}
}