package elevens;

import java.util.Arrays;

public class arePermutations {
	public static boolean arePermuations(int[] one, int[] two)
	{
		Arrays.sort(one, 0, one.length - 1);
		Arrays.sort(two, 0, two.length - 1);
		int count = 0;
		for (int i = 0; i < one.length; i++)
		{
			if (one[i] == two[i])
			{
				count ++;
			}
		}
		if (count == one.length)
		{
			return true;
		}
		return false;
	}

}
