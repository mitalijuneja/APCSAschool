package unit6;


import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class WhileLoopCircles extends Canvas
{
	public WhileLoopCircles()
	{
		setBackground(Color.WHITE);
	}
	
	public void paint( Graphics window )
	{
 		window.setColor(Color.white);
 		window.fillRect(0,0,640,480);
 		
		window.setColor(Color.red);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Lab 9A", 20, 40 );
	  	window.drawString("Drawing Circles Using a while loop ", 20, 80 );
	  	drawCircles(window);
	}
	
	public void drawCircles(Graphics window)
	{
		int x = 95;
		int y = 95;                                                                             ;

		//add in a while loop
		int a = 1;
		while(a < 10)
		{
			window.setColor(Color.blue);
			window.drawOval(x, y, x/2, y/2);
			x = x+5;
			y = y+5;
			a++;
		}
		
			
			//drawOval(int x1, it y1, int width, int height)
			//window.drawOval( x, y, x/2, y/2 );

	}	
}
