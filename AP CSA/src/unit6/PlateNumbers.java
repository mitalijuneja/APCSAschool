package unit6;
import java.util.Random;

public class PlateNumbers {
	public static void main(String[]args)
	{
		Random r = new Random();
		String license = "";
		for (int i = 0; i < 3; i++)
		{
			char letter = (char)( r.nextInt(26) + 65);
			license = license + letter;
			
		}
		for (int i = 0; i < 4; i++)
		{
			int number = r.nextInt(10);
			license = license + number;
		}
		System.out.println(license);
	}

}
