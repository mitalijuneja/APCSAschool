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
	private Aliens alienMatrix;
	private ArrayList<Alien> aliens;
	private ArrayList<Boolean> hit;

	/* uncomment once you are ready for this part
	 *

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
		alienMatrix = new Aliens();
		aliens = new ArrayList<Alien>();
		hit = new ArrayList<Boolean>();
		for (int i = 0; i < alienMatrix.getAliens().length*alienMatrix.getAliens()[0].length; i++)
		{
			hit.add(false);
		}
		for (int r = 0; r < alienMatrix.getAliens().length; r++)
		{
			for (int c = 0; c < alienMatrix.getAliens()[r].length; c++)
			{
				aliens.add(alienMatrix.getAliens()[r][c]);
			}
		}
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
		int count = 0;
		for (boolean b: hit)
		{
			if (b == true)
			{
				count++;
			}
		}
		if (count ==  hit.size())
		{
			graphToBack.setColor(Color.CYAN);
			graphToBack.drawString("YOU WIN!", 300, 500);
		}
		
		ship.draw(graphToBack);
		for (Alien a:aliens)
		{
			a.draw(graphToBack);
		}
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		
		
		
		if (aliens.get(0).getX() >= 20 && aliens.get(0).getX()<= 700 )
		{
			aliens.get(0).move("RIGHT");
		}
		else
		{
			aliens.get(0).setSpeed(0 - aliens.get(0).getSpeed());
			aliens.get(0).move("RIGHT");
		}
		

		if (aliens.get(1).getX() >= 20 && aliens.get(1).getX() <= 700)
		{
			aliens.get(1).move("LEFT");
		}
		else
		{
			aliens.get(1).setSpeed(0 - aliens.get(1).getSpeed());
			aliens.get(1).move("LEFT");
		}

		if (aliens.get(2).getX() >= 20 && aliens.get(2).getX() <= 700)
		{
			aliens.get(2).move("LEFT");
		}
		else
		{
			aliens.get(2).setSpeed(0 - aliens.get(2).getSpeed());
			aliens.get(2).move("LEFT");
		}
		if (aliens.get(3).getX() >= 20 && aliens.get(3).getX() <= 700)
		{
			aliens.get(3).move("LEFT");
		}
		else
		{
			aliens.get(3).setSpeed(0 - aliens.get(3).getSpeed());
			aliens.get(3).move("LEFT");
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
		if (ammo.collide(aliens.get(0)))
		{
			aliens.get(0).hit(graphToBack);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			score++;
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("Score: " + score , 100, 500);
			ammo.setPos(ship.getX(), ship.getY());
			keys[4] = false;
			hit.set(0, true);
		}
		if (ammo.collide(aliens.get(1)))
		{
			aliens.get(1).hit(graphToBack);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			score++;
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("Score: " + score , 100, 500);
			ammo.setPos(ship.getX(), ship.getY());
			keys[4] = false;
			hit.set(1, true);
		}
		
		if (ammo.collide(aliens.get(2)))
		{
			aliens.get(2).hit(graphToBack);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			score++;
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("Score: " + score , 100, 500);
			ammo.setPos(ship.getX(), ship.getY());
			keys[4] = false;
			hit.set(2, true);

		}
		if (ammo.collide(aliens.get(3)))
		{
			aliens.get(3).hit(graphToBack);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			score++;
			graphToBack.setColor(Color.GREEN);
			graphToBack.drawString("Score: " + score , 100, 500);
			ammo.setPos(ship.getX(), ship.getY());
			keys[4] = false;
			hit.set(3, true);

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
			
			if (!ammo.offScreen() && !ammo.collide(aliens.get(0)) && !ammo.collide(aliens.get(1)) && !ammo.collide(aliens.get(2)) && !ammo.collide(aliens.get(3)))
			{
				keys[4] = true;
			}
			
			else if (ammo.offScreen())
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
