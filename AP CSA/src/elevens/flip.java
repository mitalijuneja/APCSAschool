package elevens;

public class flip {
	public static String flip()
	{
		int flip = (int)(Math.random() * 3);
		if (flip <2 )
		{
			return "heads";
		}
		return "tails";

	}
	
}
