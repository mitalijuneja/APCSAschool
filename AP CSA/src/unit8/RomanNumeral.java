package unit8;


import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
		int testNumber = number;
		roman = "";
		for (int i = 0; i < NUMBERS.length; i++)
		{
			while (NUMBERS[i] <= testNumber)
			{
				roman = roman + LETTERS[i];
				testNumber = testNumber - NUMBERS[i];
			}
		}
	}

	public void setRoman(String rom)
	{
		roman = rom;
		String testRoman = roman;
		number =0;
		int index = 0;
		while (testRoman.length() > 0)
		{
			for (int i = LETTERS.length - 1; i > -1; i--)
			{
				if (testRoman.indexOf(LETTERS[i]) >=0)
				{
					number = number + NUMBERS[i];
					System.out.println(number);
					testRoman = testRoman.replaceAll(LETTERS[i], "");
					System.out.println(testRoman);
				}
			}
		}
		

	}

	public Integer getNumber()
	{
		return number;
	}

	public String toString()
	{
		return roman;
		
		
		
	}
}