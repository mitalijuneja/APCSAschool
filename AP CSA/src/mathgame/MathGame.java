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

public class MathGame extends Canvas implements KeyListener, Runnable
{
	//variables
	private Operator sign;
	private Number n1;
	private Number n2;
	private Answer answers;


	private boolean[] keys;
	private BufferedImage back;

	public MathGame()
	{
		setBackground(Color.white);

		keys = new boolean[3];
		sign = new Operator();
		n1 = new Number();
		n2 = new Number();
		answers = new Answer();

		n1.random();
		
		n2.random();
		
		sign.random();
		sign.setImage();
		
		while (sign.getSign().equals("divide") && n2.getNumber() == 0)
		{
			n2.random();
		}
		
		if ((n1.getNumber() < n2.getNumber() || sign.getSign().equals("subtract)")))
		{
			int temp = n1.getNumber();
			
			n1.setNumber(n2.getNumber());
			n2.setNumber(temp);
		}
		
		while (sign.getSign().equals("divide") && n1.getNumber() % n2.getNumber() != 0)
		{
			n2.random();
		}
		
		n1.setImage();
		n2.setImage();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		Graphics2D twoDGraph = (Graphics2D)window;

		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));


		Graphics graphToBack = back.createGraphics();
		
	

		n1.draw(graphToBack, 50, 50);
		n2.draw(graphToBack, 290, 50);
		sign.draw(graphToBack, 210, 90);
		
		
		

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			
			
			keys[4] = false;
			
		}
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