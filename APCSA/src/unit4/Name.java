package unit4;

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name = "";

	}

	public Name(String s)
	{

		setName(s);
		getFirst();
		getLast();
	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		String first = name.substring(0, name.indexOf(' ') + 1);
		return first;
	}

	public String getLast()
	{
		String last = name.substring(name.indexOf(' ') + 1);
		return last;
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}
