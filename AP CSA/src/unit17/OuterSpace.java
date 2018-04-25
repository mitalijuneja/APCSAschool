package unit17;

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

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;
	private int score;

	/* uncomment once you are ready for this part
	 *
	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		alienOne = new Alien(150,50,1);
		alienTwo = new Alien(150,150,1);
		ship = new Ship(500,350,1);
		ammo = new Ammo (ship.getX(), ship.getY(), -1);
		score = 0;

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
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.GREEN);
		graphToBack.drawString("Score: " + score, 100, 500);
		
		
		ship.draw(graphToBack);
		alienOne.draw(graphToBack);
		alienTwo.draw(graphToBack);
		
		
		
		if (alienOne.getX() >= 20 && alienOne.getX()<= 700 )
		{
			alienOne.move("RIGHT");
		}
		else
		{
			alienOne.setSpeed(0 - alienOne.getSpeed());
			alienOne.move("RIGHT");
		}
		

		if (alienTwo.getX() >= 20 && alienTwo.getX() <= 700)
		{
			alienTwo.move("LEFT");
		}
		else
		{
			alienTwo.setSpeed(0 - alienTwo.getSpeed());
			alienTwo.move("LEFT");
		}

		if(keys[0] == true)
		{
			if (ship.getX() >= 5)
			{
				ship.move("LEFT");
				
			}
		}

		//add code to move stuff
		if (keys[1] == true)
		{
			if (ship.getX() <= 700)
			{
				ship.move("RIGHT");
				
			}
		}
		
		if (keys[2] == true)
		{
			if (ship.getY() >= 5)
			{
				ship.move("UP");
			}
		}
		
		if (keys[3] == true)
		{
			if (ship.getY() <= 480)
			{
				ship.move("DOWN");
			}
		}
		if (keys[4] == true)
		{
			graphToBack.setColor(Color.BLACK);
			ammo.setPos(ammo.getX() + ammo.getSpeed(), ammo.getY() + ammo.getSpeed());
			graphToBack.setColor(Color.YELLOW);
			ammo.draw(graphToBack);
			keys[4] = true;
		}


		//add in collision detection
		if (ammo.collide(alienOne))
		{
			alienOne.hit(graphToBack);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			score++;
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("Score: " + score , 100, 500);
		}
		if (ammo.collide(alienTwo))
		{
			alienTwo.hit(graphToBack);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			score++;
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("Score: " + score , 100, 500);
		}
		

		

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
			
			if (!ammo.offScreen() && !ammo.collide(alienOne) && !ammo.collide(alienTwo))
			{
				keys[4] = true;
			}
			
			else
			{
				keys[4] = false;
				
				
				ammo.setPos(ship.getX(), ship.getY());
			}
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
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}
