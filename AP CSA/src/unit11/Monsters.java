package unit11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	//use an ArrayList for extra credit!!!
	//private ArrayList<Monster> myMonsters;

	private Monster[] myMonsters;

	public Monsters()
	{
		setMonsters(0);
	}

	public Monsters(int size)
	{
		setMonsters(size);

	}
	
	public void setMonsters(int size)
	{
		//size the array
		Monster [] monsters = new Monster[size];
		myMonsters = monsters;
		
		
	}
	
	public void add(int spot, Monster m)
	{
		//put m in the Monster array at [spot]
		myMonsters[spot] = m;
		

	}
	
	public Monster get(int spot)
	{
		return myMonsters[spot];
	}

	public Monster getLargest( )
	{
		//Arrays.sort() might be handy
		Arrays.sort(myMonsters);
		return myMonsters[myMonsters.length - 1];
	}

	public Monster getSmallest( )
	{
		Arrays.sort(myMonsters);
		return myMonsters[0];
	}

	public String toString()
	{
		return Arrays.toString(myMonsters);
	}
}