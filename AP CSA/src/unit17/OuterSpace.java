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
	//private Alien alienOne;
	//private Alien alienTwo;
	private Ammo ammo;
	private Ammo alienAmmo;
	private int score;
	private Aliens alienMatrix;
	private ArrayList<Alien> aliens;
	private ArrayList<Boolean> hit;
	private boolean alienFire;
	private PowerUp pu;
	int alienNumber;
	private boolean powerUp;
	private boolean moving;

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
		//alienOne = new Alien(150,50,1);
		//alienTwo = new Alien(150,150,1);
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
		ammo = new Ammo (ship.getX() + 35, ship.getY() + 100, -1);
		alienAmmo = new Ammo (aliens.get(1).getX() + 50, aliens.get(1).getY() + 100, 1);
		score = 0;
		alienFire = false;
		alienNumber = (int)(4*Math.random());
		pu = new PowerUp (200, 200);
		powerUp = false;
		moving = false;

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
		//System.out.println(alienFire);
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
		pu.draw(graphToBack);
		ship.draw(graphToBack);
		for (Alien a:aliens)
		{
			a.draw(graphToBack);
		}
		
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		
		
		/*graphToBack.setColor(Color.RED);
		alienAmmo.draw(graphToBack);*/
		
		
		
		for (Alien a: aliens)
		{
			if (a.getX() >= 20 && a.getX()<= 700 )
			{
				a.move("RIGHT");
			}
			else
			{
				a.setSpeed(0 - a.getSpeed());
				a.move("RIGHT");
			}
		}
		

		if(keys[0] == true)
		{
			if (ship.getX() >= 5)
			{
				ship.move("LEFT");
				if (keys[4]!= true)
				{
					ammo.setPos(ship.getX() + 35, ship.getY());
				}	
				
			}
		}

		//add code to move stuff
		if (alienFire && !moving)
		{
			moving = true;
			alienNumber = (int) (4* Math.random());
			alienAmmo.setPos(aliens.get(alienNumber).getX() + 50, aliens.get(alienNumber).getY() + 100);
			alienAmmo.setSpeed(1);
		}
		if (alienFire && moving)
		{
			
			graphToBack.setColor(Color.BLACK);
			alienAmmo.draw(graphToBack);
			alienAmmo.setPos(alienAmmo.getX() , alienAmmo.getY() + alienAmmo.getSpeed());
			graphToBack.setColor(Color.RED);
			alienAmmo.draw(graphToBack);
			alienFire = true;
			moving = true;
		}
		if (alienAmmo.offScreen())
		{
			moving = false;
		}
		/*if (alienFire == true && moving == true)
		{
			
			graphToBack.setColor(Color.BLACK);
			alienAmmo.draw(graphToBack);
			alienAmmo.setPos(alienAmmo.getX() , alienAmmo.getY() + alienAmmo.getSpeed());
			graphToBack.setColor(Color.RED);
			alienAmmo.draw(graphToBack);
		}
		else if (alienFire == true)
		{
			//System.out.println("HI");
			
			graphToBack.setColor(Color.RED);
			alienAmmo.draw(graphToBack);
			graphToBack.setColor(Color.BLACK);
			alienAmmo.draw(graphToBack);
			alienAmmo.setPos(alienAmmo.getX() , alienAmmo.getY() + alienAmmo.getSpeed());
			graphToBack.setColor(Color.RED);
			alienAmmo.draw(graphToBack);
		}*/
		if (keys[1] == true)
		{
			if (ship.getX() <= 700)
			{
				ship.move("RIGHT");
				if (keys[4]!= true)
				{
					ammo.setPos(ship.getX() + 35, ship.getY());
				}				
			}
		}
		
		if (keys[2] == true)
		{
			if (ship.getY() >= 5)
			{
				ship.move("UP");
				if (keys[4]!= true)
				{
					ammo.setPos(ship.getX() + 35, ship.getY());
				}
			}
		}
		
		if (keys[3] == true)
		{
			if (ship.getY() <= 480)
			{
				ship.move("DOWN");
				if (keys[4]!= true)
				{
					ammo.setPos(ship.getX() + 35, ship.getY());
				}
			}
		}
		if (keys[4] == true)
		{
			graphToBack.setColor(Color.BLACK);
			ammo.setPos(ammo.getX() , ammo.getY() + ammo.getSpeed());
			if (count == aliens.size())
			{
				keys[4] = false;
			}
			else
			{
				graphToBack.setColor(Color.YELLOW);
				ammo.draw(graphToBack);
				keys[4] = true;
			}
			alienFire = true;
			
		}


		//add in collision detection
		for (int i = 0; i < aliens.size(); i++)
		{
			if (ammo.collide(aliens.get(i)))
			{
				aliens.get(i).hit(graphToBack);
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Score: " + score, 100, 500);
				score++;
				graphToBack.setColor(Color.GREEN);
				graphToBack.drawString("Score: " + score , 100, 500);
				ammo.setPos(ship.getX() + 35, ship.getY());
				keys[4] = false;
				hit.set(i, true);
			}
		}
		if (ammo.collide(pu) && !powerUp)
		{
			ship.changeImage();
			powerUp = true;
			ammo.setPos(ship.getX() + 35,  ship.getY());
			keys[4] = false;
		}
		if (alienAmmo.collide(ship) && ship.getImage().equals("ship"))
		{
			alienAmmo.setSpeed(0);
			graphToBack.fillRect(alienAmmo.getX(), alienAmmo.getY(), 10, 10);
			alienAmmo.setPos(1000, 1000);
			score--;
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 100, 500);
			if (count != aliens.size())
			{
				
				graphToBack.setColor(Color.GREEN);
				graphToBack.drawString("Score: " + score , 100, 500);
				
				
			}
			
			
			alienFire = false;
			alienNumber = (int)(4*Math.random());
			
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
			if (ammo.offScreen())
			{
				keys[4] = false;
				ammo.setPos(ship.getX() + 35, ship.getY());
			}
			
			if (!ammo.offScreen() && !ammo.collide(aliens.get(0)) && !ammo.collide(aliens.get(1)) && !ammo.collide(aliens.get(2)) && !ammo.collide(aliens.get(3)))
			{
				keys[4] = true;
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