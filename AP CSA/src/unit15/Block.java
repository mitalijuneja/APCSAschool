package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(100);
		setY(100);
		setWidth(10);
		setHeight(10);
		//color
		setColor(Color.black);

	}
	
	public Block (int x, int y)
	{
		setX(x);
		setY(y);
		setWidth(10);
		setHeight (10);
		setColor(Color.black);

		
	}

	//add other Block constructors - x , y , width, height, color
	
	Block (int x, int y, int w, int h)
	{
		setPos(x,y);
		//setX(x);
		//setY(y);
		setWidth (w);
		setHeight (h);
		setColor(Color.black);
	}
	
	Block (int x, int y, int w, int h, Color c)
	{
		setPos(x,y);
		setWidth (w);
		setHeight (h);
		setColor(c);
	}
	

   //add the other set methods
   public void setPos (int x, int y)
   {
	   xPos = x;
	   yPos = y;
   }
	
	public void setX (int x)
	{
		xPos = x;
	}
	
	public void setY(int y)
	{
		yPos = y;
	}
	
	public void setWidth (int w)
	{
		width = w;
	}
	
	public void setHeight (int h)
	{
		height = h;
	}
	
	
   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   
	   setColor(col);
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Block b = (Block)obj;
		if (b.getHeight() == this.getHeight() && b.getWidth() == this.getWidth() && b.getX() == this.getX() && b.getY() == this.getY() && b.getColor() == this.getColor())
		{
			return true;
		}

		return false;
	}   

   //add the other get methods
    
	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public Color getColor()
	{
		return color;
	}
   //add a toString() method  - x , y , width, height, color
	
	public String toString ()
	{
		String output = "";
		output = output + getX() + " , " + getY() + " , " + getWidth() + " , " + getHeight() + " , " + getColor();
		return output;
	}
}