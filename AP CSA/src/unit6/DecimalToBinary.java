package unit6;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int decimal = keyboard.nextInt();
		String binary = "";
		
		for (int i = 7; i >= 0; i--)
		{
			if (decimal/(int)Math.pow(2, i) > 0)
			{
				decimal = decimal - (int) Math.pow(2, i);
				binary = binary + "1";
			}
			else
				binary = binary + "0";
		}
		System.out.println("\nIn binary: " + binary);
	}
}
