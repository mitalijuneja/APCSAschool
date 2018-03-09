package unit11;

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}



	//write an initialization constructor with an int parameter ht
	public Monster (int ht)
	{
		myHeight = ht;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster (int ht, int wt)
	{
		myHeight = ht;
		myWeight = wt;
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster (int ht, int wt, int age)
	{
		setHeight (ht);
		setWeight(wt);
		setAge(age);
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight (int ht)
	{
		myHeight = ht;
	}
	
	public void setWeight(int wt)
	{
		myWeight = wt;
	}
	
	public void setAge(int age)
	{
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getHeight ()
	{
		return myHeight;
	}
	
	public int getWeight()
	{
		return myWeight;
	}
	
	public int getAge()
	{
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   Monster monsterCopy = new Monster(myHeight, myWeight, myAge);
		
	   return monsterCopy;
	}

	public boolean equals( Object obj )
	{
		Monster m = (Monster)obj;
		
		Monster myMonster = new Monster(this.getHeight(), this.getWeight(), this.getAge());
		if (myMonster == m)
		{
			return true;
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (rhs.getHeight() == this.getHeight())
		{
			return 0;
		}
		
		return this.getHeight() - rhs.getHeight();
	}

	//write a toString() method
	public String toString()
	{
		String output = getHeight() + " " + getWeight() + " " + getAge();
		return output;
	}
	
	
}
