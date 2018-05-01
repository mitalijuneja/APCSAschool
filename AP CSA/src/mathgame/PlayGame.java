package mathgame;

import javax.swing.JFrame;
import java.awt.Component;

public class PlayGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public PlayGame()
	{
		super("MATH");
		setSize(WIDTH,HEIGHT);

		MathGame theGame = new MathGame();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		MathGame run = new MathGame();
	}
}









