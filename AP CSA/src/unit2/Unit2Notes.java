package unit2;

public class Unit2Notes {
	static float fNum = 4.5556677f;
	static String   output = "";
	static int number = 0;
	public static void main(String[]args)
	{
		output += "Formatted Number: ";
		output += String.format("%.2f", fNum);
		System.out.println(output);
		
		fNum = 6.785756f;
		output = "Formatted Number: ";
		output += String.format("%.2f", fNum);
		System.out.println(output);
		
		number = (int)fNum;
		fNum = number;//no casting needed (float can hold int because float is bigger); no casting to string (automatically converted)
		System.out.println(number);
	}

}
