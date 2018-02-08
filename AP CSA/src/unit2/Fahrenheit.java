package unit2;

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = (5.0/9)*(fahrenheit - 32);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius\n", fahrenheit, getCelsius());
	}
}