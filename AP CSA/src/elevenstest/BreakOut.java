package elevenstest;

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
import java.util.ArrayList;

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private Paddle paddle1;
	private Paddle paddle2;
	private Paddle paddle3;
	private Paddle paddle4;
	private Paddle paddle5;
	private Paddle paddle6;
	private Paddle paddle7;
	private Paddle paddle8;
	private Paddle paddle9;
	private Paddle paddle10;
	private Paddle paddle11;
	private Paddle paddle12;
	private Paddle paddle13;
	private Paddle paddle14;
	private Paddle paddle15;
	private Paddle paddle16;
	private Paddle paddle17;
	private Paddle paddle18;
	private Paddle paddle19;
	private Paddle paddle20;

	
	private ArrayList<Paddle> paddlesArr;
	private ArrayList<Boolean> hitPaddles;
	//private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score;
	private String sc;
	
	
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;


	public BreakOut()
	{
		//set up all variables related to the game
		System.out.println("Mitali Juneja\nPeriod 4\nApril 4, 2018\nComputer 2");
		ball = new Ball (720, 210,10, 10, Color.BLUE,2, -1 );
		paddle = new Paddle (750,240,20, 80, Color.GREEN);
		hitPaddles = new ArrayList<Boolean>();
		for (int i =1; i <= 20; i++)
		{
			hitPaddles.add(true);
		}//600-60 = 540 / 5 = 108
		paddlesArr = new ArrayList<Paddle>();
		paddle1 = new Paddle (15, 10, 5, 108, Color.ORANGE);
		paddle2 = new Paddle (15, 128, 5, 108, Color.ORANGE);
		paddle3 = new Paddle (15, 246, 5, 108, Color.ORANGE);
		paddle4 = new Paddle (15, 364, 5, 108, Color.ORANGE);
		paddle5 = new Paddle (15, 482, 5, 108, Color.ORANGE);
		paddle6 = new Paddle (25, 10, 5, 108, Color.ORANGE);
		paddle7 = new Paddle (25, 128, 5, 108, Color.ORANGE);
		paddle8 = new Paddle (25, 246, 5, 108, Color.ORANGE);
		paddle9 = new Paddle (25, 364, 5, 108, Color.ORANGE);
		paddle10 = new Paddle (25, 482, 5, 108, Color.ORANGE);
		paddle11 = new Paddle (35, 10, 5, 108, Color.ORANGE);
		paddle12 = new Paddle (35, 128, 5, 108, Color.ORANGE);
		paddle13 = new Paddle (35, 246, 5, 108, Color.ORANGE);
		paddle14 = new Paddle (35, 364, 5, 108, Color.ORANGE);
		paddle15 = new Paddle (35, 482, 5, 108, Color.ORANGE);
		paddle16 = new Paddle (45, 10, 5, 108, Color.ORANGE);
		paddle17 = new Paddle (45, 128, 5, 108, Color.ORANGE);
		paddle18 = new Paddle (45, 246, 5, 108, Color.ORANGE);
		paddle19 = new Paddle (45, 364, 5, 108, Color.ORANGE);
		paddle20 = new Paddle (45, 482, 5, 108, Color.ORANGE);
		
		paddlesArr.add(paddle1);
		paddlesArr.add(paddle2);
		paddlesArr.add(paddle3);
		paddlesArr.add(paddle4);
		paddlesArr.add(paddle5);
		paddlesArr.add(paddle6);
		paddlesArr.add(paddle7);
		paddlesArr.add(paddle8);
		paddlesArr.add(paddle9);
		paddlesArr.add(paddle10);
		paddlesArr.add(paddle11);
		paddlesArr.add(paddle12);
		paddlesArr.add(paddle13);
		paddlesArr.add(paddle14);
		paddlesArr.add(paddle15);
		paddlesArr.add(paddle16);
		paddlesArr.add(paddle17);
		paddlesArr.add(paddle18);
		paddlesArr.add(paddle19);
		paddlesArr.add(paddle20);
		



		/*paddlesArr.add(paddle1);
		Paddle paddle2 = new Paddle (15, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle2);
		Paddle paddle3 = new Paddle (135, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle3);
		Paddle paddle4 = new Paddle (195, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle4);
		Paddle paddle5 = new Paddle (255, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle5);
		Paddle paddle6 = new Paddle (315, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle6);
		Paddle paddle7 = new Paddle (375, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle7);
		Paddle paddle8 = new Paddle (435, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle8);
		Paddle paddle9 = new Paddle (495, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle9);
		Paddle paddle10 = new Paddle (555, 50, 50, 20, Color.ORANGE);
		paddlesArr.add(paddle10);*/





		//rightPaddle = new Paddle (WIDTH - 35, 50, 20, 80, Color.ORANGE);
		score = 0;
		sc = "Score = " + score;
		



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


		
		paddle.draw(graphToBack);
		paddle1.draw(graphToBack);
		paddle2.draw(graphToBack);
		paddle3.draw(graphToBack);
		paddle4.draw(graphToBack);
		paddle5.draw(graphToBack);
		paddle6.draw(graphToBack);
		paddle7.draw(graphToBack);
		paddle8.draw(graphToBack);
		paddle9.draw(graphToBack);
		paddle10.draw(graphToBack);
		paddle11.draw(graphToBack);
		paddle12.draw(graphToBack);
		paddle13.draw(graphToBack);
		paddle14.draw(graphToBack);
		paddle15.draw(graphToBack);
		paddle16.draw(graphToBack);
		paddle17.draw(graphToBack);
		paddle18.draw(graphToBack);
		paddle19.draw(graphToBack);
		paddle20.draw(graphToBack);
		ball.moveAndDraw(graphToBack);
		

	


		//rightPaddle.draw(graphToBack);
		Color currentColor = paddle.getColor();
		graphToBack.setColor(Color.white);
		graphToBack.drawString(sc, 350, 450);
		//graphToBack.drawString(leftSc, 350, 470);
		graphToBack.setColor(currentColor);
		sc = "Score = " + score;

		graphToBack.drawString(sc, 350, 450);
		//graphToBack.drawString(leftSc, 350, 470);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<= WIDTH))
		{
			ball.setXSpeed(0-ball.getXSpeed());
			//ball.setYSpeed(0);
			/*if (ball.getX() <=15)
			{
				rightScore++;
					

			}*/
			
			if (ball.getX() >=WIDTH - 15)
			{
				score = 0;
			
				ball.setPos(300,  300);
				ball.setXSpeed(2);
				ball.setYSpeed(1);
				

			}
		}

		
		//see if the ball hits the top or bottom wall 
		if (!(ball.getY()>= 10 && ball.getY() <=HEIGHT - 40))
		{
			//ball.setXSpeed(0);
			ball.setYSpeed(0- ball.getYSpeed());
		}

		if (ball.didCollideBottom(paddle))
		{
			ball.setYSpeed(0 - ball.getYSpeed());
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
		
		if (ball.didCollideRight(paddle) || ball.didCollideBottom(paddle) || ball.didCollideTop(paddle))
		{
			
			if (ball.didCollideRight(paddle))
			{
				ball.setXSpeed(0 - ball.getXSpeed());
				
				
			}
			else if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle))
			{
				ball.setYSpeed(0-ball.getYSpeed());
				
			}
		}
		for (int i = 0; i < paddlesArr.size(); i++)
		{
			
				
				
				if (ball.didCollideLeft(paddlesArr.get(i)) || ball.didCollideBottom(paddlesArr.get(i)) || ball.didCollideTop(paddlesArr.get(i)))
				{
					if (hitPaddles.get(i))
					{
						if (ball.didCollideLeft(paddlesArr.get(i)))
						{
							hitPaddles.set(i, false);
							paddlesArr.get(i).setColor(Color.white);
							ball.setXSpeed(0 - ball.getXSpeed());
							score++;
						}
						else if (ball.didCollideTop(paddlesArr.get(i)) || ball.didCollideBottom(paddlesArr.get(i)))
						{
							hitPaddles.set(i, false);
							paddlesArr.get(i).setColor(Color.white);
							ball.setYSpeed(0-ball.getYSpeed());
							score++;
						}
					}
					
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
		/*if (keys[0] == true && paddle.getX() >0)
		{
			paddle.moveLeftAndDraw(graphToBack);
		}
		if (keys[1] == true && paddle.getX() < WIDTH -1.5*paddle.getWidth())
		{
			paddle.moveRightAndDraw(graphToBack);
			

		}*/
		if (keys[2] == true && paddle.getY() >0)
		{
			paddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] ==true && paddle.getY() < HEIGHT - 1.5*paddle.getHeight())
		{
			paddle.moveDownAndDraw(graphToBack);
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