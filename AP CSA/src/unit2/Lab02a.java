package unit2;

public class Lab02a
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2,6);
		test.calculatePerimeter( );
		test.print();

		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();
		
		//add more test cases	
		
		test.setLengthWidth(131,75);
		test.calculatePerimeter( );
		test.print();
		
		test.setLengthWidth(20,25);
		test.calculatePerimeter( );
		test.print();
		
		test.setLengthWidth(9,256);
		test.calculatePerimeter( );
		test.print();
		
		test.setLengthWidth(36,72);
		test.calculatePerimeter( );
		test.print();
	}
}