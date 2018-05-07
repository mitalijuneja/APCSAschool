package mathgame;

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
import java.awt.Font;


public class MathGame extends Canvas implements KeyListener, Runnable
{
	//variables
	private Operator sign;
	private Number n1;
	private Number n2;
	private Answer answers;
	private int pressedKey;
	private int score;
	private int correctPosition;


	private boolean[] keys;
	private BufferedImage back;

	public MathGame()
	{
		setBackground(Color.gray);

		keys = new boolean[4];
		
		sign = new Operator();
		n1 = new Number();
		n2 = new Number();
		answers = new Answer();
		pressedKey = 3;
		score = 0;
		correctPosition = 10;
		

		newProblem();
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }
   
   public void startScreen(Graphics window)
   {
	   window.setColor(Color.gray);
	   window.fillRect(0, 0, 800, 600);
	   window.setColor(Color.white);
	   window.setFont(new Font ("font", Font.BOLD, 40) );
	   window.drawString("Math Facts", 300, 50);
	  
	   window.setFont(new Font ("font", Font.BOLD, 20) );
	   window.drawString("Mitali Juneja", 300, 500);
	   
	   window.setFont(new Font ("font", Font.BOLD, 20) );
	   window.setColor(Color.blue);
	   window.drawString("For each math problem that appears on the screen, select the correct ", 50, 200);
	   window.drawString("answer using number keys (1 for the left answer, 2 for the middle, and", 50, 230);
	   window.drawString("3 for the right. Every correct answer is worth 1 point. Get 10 points to win!", 50, 260);
	   
	   window.setFont(new Font ("font", Font.BOLD, 25) );
	   window.setColor(Color.CYAN);
	   window.drawString("Press the SPACE key to begin", 200, 350);
	   
	   score = 0;
   }
   
   public void winScreen(Graphics window)
   {
	   window.setColor(Color.gray);
	   window.fillRect(0, 0, 800, 600);
	   window.setColor(Color.cyan);
	   window.setFont(new Font ("font", Font.BOLD, 35) );
	   window.drawString("You win!", 350, 100);

   }
   
   public void newProblem()
   {	   
	   n1.random();
		
		n2.random();
		
		sign.random();
		sign.setImage();
		
		System.out.println("1: " + answers.getPositionC());
		System.out.println("2: " + answers.getPositionW1());
		System.out.println("3: " + answers.getPositionW2());

		System.out.println("n1 " + n1.getNumber());
		System.out.println("n2 " + n2.getNumber());

		while (sign.getNumber() == 3 && (n2.getNumber() == 0 || n1.getNumber() == 0))
		{
			sign.random();
	
		}
	
		System.out.println("n1 " + n1.getNumber());
		System.out.println("n2 " + n2.getNumber());
		if ((n1.getNumber() < n2.getNumber() || sign.getSign().equals("subtract)")))
		{
			int temp = n1.getNumber();
			
			n1.setNumber(n2.getNumber());
			n2.setNumber(temp);
		}
		System.out.println("n1 " + n1.getNumber());
		System.out.println("n2 " + n2.getNumber());
		while ((sign.getNumber() == 3) && (n1.getNumber() % n2.getNumber() != 0))
		{
			n2.random();
			while (n2.getNumber() == 0)
			{
				n2.random();
			}
		}
		System.out.println("n1 " + n1.getNumber());
		System.out.println("n2 " + n2.getNumber());
		if ((n1.getNumber() < n2.getNumber() || sign.getSign().equals("divide)")))
		{
			int temp = n1.getNumber();
			
			n1.setNumber(n2.getNumber());
			n2.setNumber(temp);
		}
		System.out.println("n1 " + n1.getNumber());
		System.out.println("n2 " + n2.getNumber());
		
		n1.setImage();
		n2.setImage();
		sign.setImage();
		answers.assignPosition();


		answers.calculateAnswer(n1.getNumber(), n2.getNumber(), sign.getNumber());
		answers.getRandom();
		System.out.println("c" + answers.getCorrect());
		System.out.println("w" + answers.getWrong1() + " " + answers.getWrong2());
		answers.positionAnswers();
		correctPosition = answers.getPositionC();
   }

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;

		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));


		Graphics graphToBack = back.createGraphics();
		
		if (score == 10)
		{
			graphToBack.setColor(Color.gray);
			graphToBack.fillRect(0, 0, 800, 600);
			winScreen(graphToBack);
		}
		else if (keys[3] == false)
		{
			startScreen(graphToBack);
		}
		else
		{
			
			graphToBack.setColor(Color.gray);
			graphToBack.fillRect(0, 0, 800, 600);
			graphToBack.setColor(Color.white);
			graphToBack.drawString("Score: " + score, 400, 350);

			n1.draw(graphToBack, 50, 50);
			n2.draw(graphToBack, 290, 50);
			sign.draw(graphToBack, 210, 90);
			
			
			
			graphToBack.drawString("" + answers.getChoices()[0], 100, 300);
			graphToBack.drawString("" + answers.getChoices()[1], 200, 300);
			graphToBack.drawString("" + answers.getChoices()[2], 300, 300);
			
			if (pressedKey == answers.getPositionC())
			{
				//score++;
				graphToBack.setColor(Color.gray);
				graphToBack.fillRect(0, 0, 800, 600);
				newProblem();
			}
			
		}
		
		

		

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_1)
		{
			keys[0] = true;
			pressedKey = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_2)
		{
			keys[1] = true;
			pressedKey = 1;
		}
		if (e.getKeyCode() == KeyEvent.VK_3)
		{
			keys[2] = true;
			pressedKey = 2;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[3] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_1)
		{
			keys[0] = false;
			pressedKey = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_2)
		{
			keys[1] = false;
			pressedKey = 1;
		}
		if (e.getKeyCode() == KeyEvent.VK_3)
		{
			keys[2] = false;
			pressedKey = 2;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[3] = true;
			score = 0;
			score = score -1 ;
		}
		if (correctPosition == answers.getPositionC())
		{
			score++;
		}
		pressedKey = 3;
		correctPosition = answers.getPositionC();
		
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

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
    	  System.out.println("X");
      }
  	}
}