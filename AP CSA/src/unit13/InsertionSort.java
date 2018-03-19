package unit13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{



	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		if (!(list.contains(word)))
		{
			String[] listArr = new String[list.size() + 1];
			for (int i = 0; i < list.size(); i++)
			{
				listArr[i] = list.get(i);
			}
			int index = Arrays.binarySearch(listArr, word);
			index = Math.abs(index) - 1;
			list.add(index, word);
		}


	}


	public void remove(String word)
	{
		int index =list.indexOf(word);
		list.remove(index);
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < list.size(); i++)
		{
			output = output +  list.get(i);
		}
		return output;
	}
}