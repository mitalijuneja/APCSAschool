package mathgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;


public class Answer {
	
	private int correct;
	private int wrong1;
	private int wrong2;
	private int positionC;
	private int positionW1;
	private int positionW2;
	
	private Image imageC;
	private Image imageW1;
	private Image imageW2;
	
	String imageNameC;
	String imageNameW1;
	String imageNameW2;
	
	
	public Answer()
	{
		correct = 0;
		wrong1 = 30;
		wrong2 = 30;
		
		positionC = 0;
		positionW1 = 0;
		positionW2 = 0;
	}
	
	public void calculateAnswer(int number1, int number2, int sign)
	{
		if (sign == 0)
		{
			correct = number1 + number2;
		}
		
		if (sign == 1)
		{
			correct = number1 - number2;
		}
		
		if (sign ==2)
		{
			correct = number1 * number2;
		}
		
		if (sign == 3)
		{
			correct = number1/number2;
		}
	}
	
	public int getCorrect()
	{
		return correct;
	}
	
	public int getWrong1()
	{
		return wrong1;
	}
	
	public int getWrong2()
	{
		return wrong2;
	}
	
	public int getPositionC()
	{
		return positionC;
	}
	
	public int getPositionW1()
	{
		return positionW1;
	}
	
	public int getPositionW2()
	{
		return positionW2;
	}
	
	public void assignPosition()
	{
		positionC = (int) (Math.random() * 3);
		while ((positionW1 == positionC) || (positionW2 == positionC) ||(positionW1 == positionW2))
		{
			positionW1 = (int) (Math.random() *3);
			positionW2 = (int)(Math.random() * 3);
			
		}
	}
	
	public void setImages()
	{
		imageNameC = correct + ".png";
		imageNameW1 = wrong1 + ".png";
		imageNameW2 = wrong2 + ".png";
		
		
		try
		{
			imageC = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\mathgame\\" + imageNameC));
			imageW1 = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\mathgame\\" + imageNameW1));
			imageW2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\src\\mathgame\\" + imageNameW2));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("hi");
		}
		

	}
	public void getRandom()
	{
		wrong1 = correct;
		wrong2 = correct;
		
		while (wrong1 == correct || wrong2 == correct)
		{
			wrong1 = (int) (Math.random() * (correct + 5));
			wrong2 = (int) (Math.random() * (correct + 5));
			System.out.println("HI");
		}
	} 

}
