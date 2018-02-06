//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

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
		celsius = fahrenheit - 32.0;
		celsius = celsius*(5.0/9.0);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.printf("%.2f degrees Fahrenheit == %.2f degrees Celsius \n\n", fahrenheit, getCelsius());
	}
}