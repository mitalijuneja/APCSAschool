package unit17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private String imageName;

	public Ship()
	{
		this(0,0,0);
	}

	public Ship(int x, int y)
	{
		this(x,y,0);
	}

	public Ship(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\unit17\\ship.jpg"));
			imageName = "ship";
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("hi");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),80,80,null);
	}

	public void changeImage()
	{
		try
		{
			image = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\unit17\\ship.jpgWithShield.jpg"));
			imageName = "shield";
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("hi");
		}
	}
	public String getImage()
	{
		return imageName;
	}
	public String toString()
	{
		return super.toString() + "speed = " + getSpeed();
	}
}