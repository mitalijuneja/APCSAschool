package unit14;

public class Animal {
	String name;
	int age;
	
	
	public Animal()
	{
		name = "";
		age = 0;
	}
	
	public Animal(String n, int a)
	{
		setName(n);
		setAge(a);
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	public void changeAge(int a)
	{
		age = a;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}


}
