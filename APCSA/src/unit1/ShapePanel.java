package unit1;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
		//tell your shape to draw
		Shape shapeOne = new Shape(30,30,50,50, Color.BLUE);
		shapeOne.draw(window);
		

		//instantiate a Shape
		//tell your shape to draw
		Shape shapeTwo = new Shape (100,100,100,100, Color.GREEN);
		shapeTwo.draw(window);

		//instantiate a Shape
		//tell your shape to draw
		Shape shapeThree = new Shape (300,300,150,150,Color.PINK);
		shapeThree.draw(window);
	}
}
