package unit15;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
		ball = new Ball();
		System.out.println(ball);
	
		
		//test the Ball thoroughly
		ball.setColor(Color.BLUE);
		ball.setHeight(15);

		//test all constructors
		Ball ballTwo = new Ball(10, 10);
		System.out.println(ballTwo);
		
		Ball ballThree = new Ball(40, 50, 20, 10);
		System.out.println(ballThree);
		
		Ball ballFour = new Ball(20, 30, 20, 20, Color.RED);
		System.out.println(ballFour);
		
		Ball ballFive = new Ball(20, 30, 20, 20, Color.RED, 3, 3);
		System.out.println(ballFive);

		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXSpeed(-ball.getXSpeed());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}