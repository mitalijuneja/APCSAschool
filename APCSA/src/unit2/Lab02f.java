package unit2;

public class Lab02f {
	public static void main(String[]args)
	{
		Line Line1 = new Line(1,9,14,2);
		Line1.calculateSlope();
		Line1.print();
		
		Line Line2 = new Line(1,7,18,3);
		Line2.calculateSlope();
		Line2.print();
		
		Line Line3 = new Line(6,4,2,2);
		Line3.calculateSlope();
		Line3.print();
		
		Line Line4 = new Line(4,4,5,3);
		Line4.calculateSlope();
		Line4.print();
		
		Line Line5 = new Line(1,1,2,9);
		Line5.calculateSlope();
		Line5.print();
	}

}
