package unit14;

public class Dog extends Animal {
	String color;
	
	public Dog ()
	{
		name = "";
		age = 0;
	}
	
	public Dog(String n, int a, String c)
	{
		super(n, a);
		setColor (c);
	}
	public void setColor(String c)
	{
		color = c;
	}

	
}
