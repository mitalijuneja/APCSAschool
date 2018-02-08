package unit1;


import javax.swing.JFrame;

public class GraphicsRunner extends JFrame//gives a window
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		
		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());//create a window, put canvas in the window
		
		getContentPane().add(new ShapePanel());		
		
		//getContentPane().add(new Robot());
		//getContentPane().add(new ReviewOne());
		
		
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();//instantiation
		//ReviewOne test = new ReviewOne();
		//test.lengthWidth();
		
	}
}