package unit15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class PongInvisibleBall extends Canvas implements KeyListener, Runnable
{
	private InvisibleBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;
	private String rightSc;
	private String leftSc;
	
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;


	public PongInvisibleBall()
	{
		//set up all variables related to the game
		ball = new InvisibleBall (Color.BLUE);
		leftPaddle = new Paddle (15, 50, 20, 80, Color.ORANGE);
		rightPaddle = new Paddle (WIDTH - 35, 50, 20, 80, Color.ORANGE);
		rightScore = 0;
		leftScore = 0;
		rightSc = "Right Score = " + rightScore;
		leftSc = " Left Score = " + leftScore;
		



		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		Color currentColor = leftPaddle.getColor();
		graphToBack.setColor(Color.white);
		graphToBack.drawString(rightSc, 350, 450);
		graphToBack.drawString(leftSc, 350, 470);
		graphToBack.setColor(currentColor);
		rightSc = "Right Score = " + rightScore;
		leftSc = "Left Score = " + leftScore;

		graphToBack.drawString(rightSc, 350, 450);
		graphToBack.drawString(leftSc, 350, 470);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<= WIDTH))
		{
			ball.setXSpeed(0-ball.getXSpeed());
			//ball.setYSpeed(0);
			if (ball.getX() <=15)
			{
				rightScore++;
					

			}
			
			if (ball.getX() >=WIDTH - 15)
			{
				leftScore++;

			}
		}

		
		//see if the ball hits the top or bottom wall 
		if (!(ball.getY()>= 10 && ball.getY() <=HEIGHT - 40))
		{
			//ball.setXSpeed(0);
			ball.setYSpeed(0- ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		/*if ((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()) && (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() || ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())))
		{
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(0-ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(0 - ball.getXSpeed());
			}
		}*/
		if (ball.didCollideLeft(leftPaddle) || ball.didCollideBottom(leftPaddle) || ball.didCollideTop(leftPaddle))
		{
			if (ball.didCollideLeft(leftPaddle))
			{
				ball.setXSpeed(0 - ball.getXSpeed());
			}
			else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle))
			{
				ball.setYSpeed(0-ball.getYSpeed());
			}
		}
		
		if ( ball.didCollideRight(rightPaddle) || ball.didCollideBottom(rightPaddle) || ball.didCollideTop(rightPaddle))
		{
			if (ball.didCollideRight(rightPaddle))
			{
				ball.setXSpeed(0 - ball.getXSpeed());
			}
			else if (ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle))
			{
				ball.setYSpeed(0-ball.getYSpeed());
			}
		}
		
		
		
		//see if the ball hits the right paddle
		/*if ((ball.getX() >= rightPaddle.getX() - Math.abs(ball.getXSpeed()) && (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight() || ball.getY() + ball.getHeight() >= rightPaddle.getY() && ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())))
		{
			if (ball.getX() >= rightPaddle.getX() + Math.abs(ball.getXSpeed()))//-ball.getWidth()
			{
				ball.setYSpeed(0 - ball.getYSpeed());
			}
			else
			{
				ball.setXSpeed(0 - ball.getXSpeed());
			}
		}*/
		


		//see if the paddles need to be moved
		if (keys[0] == true && leftPaddle.getY() >0)
		{
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true && leftPaddle.getY() < HEIGHT -1.5*leftPaddle.getHeight())
		{
			leftPaddle.moveDownAndDraw(graphToBack);
			

		}
		if (keys[2] == true && rightPaddle.getY() >0)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] ==true && rightPaddle.getY() < HEIGHT - 1.5*rightPaddle.getHeight())
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

	
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}