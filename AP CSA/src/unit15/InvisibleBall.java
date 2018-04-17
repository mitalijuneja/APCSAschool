package unit15;

import java.awt.Color;
import java.awt.Graphics;

public class InvisibleBall extends Ball {
	int n = 10;
	public InvisibleBall()
	   {
			super();
	   }

	   public InvisibleBall(int x, int y)
	   {
		   super(x,y);
	   }

	   public InvisibleBall(int x, int y, int wid, int ht)
	   {

		   super(x,y,wid,ht);

	   }

	   public InvisibleBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
	   {

		   super(x,y,wid,ht,xSpd, ySpd);

	   }

	   public InvisibleBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	   {

		   super(x, y, wid, ht, col, xSpd, ySpd);

	   }
	   public InvisibleBall (Color col)
	   {
		   super(col);
	   }

	   public int randomNumber()
	   {
		   	int n = 0;
	 		n = (int) (Math.random() * 500);
	 		
	 		return n;
	   }

	   public void moveAndDraw(Graphics window)
	   {
		   Color currentColor = getColor();
		   draw(window, Color.white);

		   setX(getX()+this.getXSpeed());
		      
		   setY(getY() + this.getYSpeed());
		   /*if (randomNumber())
		   {
			   if (Color.white.equals(currentColor))
			   {
				   currentColor = Color.blue; 
			   }
			   else
			   {
				   currentColor = Color.white;
			   }
			   
		   }*/
		   n--;
		   if (n == 0 && Color.white.equals(currentColor))
		   {
			   //System.out.println("b " + n);
			   currentColor = Color.blue;
			   n = randomNumber();
		   }
		   if (n == 0 && Color.blue.equals(currentColor))
		   {
			   //System.out.println("w " + n);
			   currentColor = Color.white;
			   n = randomNumber();
		   }
		   draw(window, currentColor);

	   }
}