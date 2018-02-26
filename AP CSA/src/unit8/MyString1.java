package unit8;

public class MyString1 {
	
	char[] chars;
	public MyString1(char[] chars)
	{
		this.chars = chars;
	}
	
	public char charAt(int index)
	{
		return chars[index];
	}
	
	public int length()
	{
		int length = 0;
		for (char c:chars)
		{
			length++;
		}
		return length;
	}
	
	public MyString1 substring(int begin, int end)
	{
		char[] myChars = new char[end - begin];
		
		int index = 0;
		for (int i = begin; i < end; i++)
		{
			myChars[index] = chars[i];
			index ++;
		}
		MyString1 str = new MyString1(myChars);
		return str;
	}
	
	public MyString1 toLowerCase()
	{
		char[] myChars = new char[chars.length];
		for (char c: myChars)
		{
			if (c > 65 && c < 90)
			{
				c = (char)(c + 32);
			}
		}
		MyString1 str = new MyString1 (myChars);
		return str;
	}
	
	public boolean equals(MyString1 s)
	{
		for (int i = 0; i < s.getCharacters().length(); i++)
		{
			if (s.getCharacters()[i] != this.getCharacters()[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static MyString1 valueOf(int i)
	{
		return chars[i];
	}
	
	public toString()
	{
		
	}
	
	

}
