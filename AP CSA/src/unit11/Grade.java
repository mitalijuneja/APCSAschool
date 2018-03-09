package unit11;

public class Grade {
	private double value;
	
	public Grade()
	{
		setValue(0);
	}
	
	public Grade(int v)
	{
		setValue(v);
	}
	
	public void setValue(int v)
	{
		value = v;
	}

	public String getLetterGrade()
	{
		if (value >=90)
		{
			return "A";
		}
		else if (value >=80)
		{
			return "B";
		}
		else if (value >= 70)
		{
			return "C";
		}
		else if (value >= 60)
		{
			return "D";
		}
		return "F";
	}
	public double getNumericGrade()
	{
		return value;
	}
}
