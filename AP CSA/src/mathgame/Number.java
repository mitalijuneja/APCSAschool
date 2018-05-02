package mathgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;


public class Number extends Symbols {
	private Image image;
	private String imageName;
	//private String[] images;
	
	
	public Number()
	{
		number = 0;
	}
	
	public void random()
	{
		number = (int)(Math.random() * 10);
	}
	
	/*public int getNumber()
	{
		return number;
	}*/

	
	public void setImage()
	{
		imageName = number+ ".png";
		try
		{
			image = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\mathgame\\" + imageName));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("hi");
		}
		
	}
	
	public void draw(Graphics window, int x, int y)
	{
		window.drawImage(image,x,y,162,169,null);
	}

}
