package mathgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Operator extends Symbols{

	private String[] signs;
	private Image image;
	private String imageName;
	
	
	public Operator()
	{
		signs = new String[4];
		
		signs[0] = "add";
		signs[1] = "subtract";
		signs[2] = "multiply";
		signs[3] = "divide";
		
	}
	public void random()
	{
		
		setNumber((int)(Math.random() * 4));
		//System.out.println(getNumber());

	}
	
	public String getSign()
	{
		return signs[getNumber()];
	}
	public void setImage()
	{
		imageName = signs[getNumber()] + ".png";
		
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
	
	public void draw (Graphics window, int x, int y)
	{
		window.drawImage(image,x,y,80,80,null);
	}
	
	
}
