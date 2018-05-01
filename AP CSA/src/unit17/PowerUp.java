package unit17;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class PowerUp  extends MovingThing{
	private Image image;
	private int speed;
	 

public PowerUp(int x, int y)
		{
	super(x, y);

			setSpeed(0);
			
			try
			{
				image = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\unit17\\pu.JPG"));
			}
			catch(Exception e)
			{
				//feel free to do something here
				System.out.println("hi");
			}
		}
public void setSpeed(int s)
{
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
		
	}


