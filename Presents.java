
//MADE BY EG - creates a present object to do stuff with

public class Presents
{
	//instance variables
	private String toyName;
	private int minAge;
	private int maxAge;
	private double price;
	private int daysToMake;

	//constructor to initialize instance variables
	public Presents(String n, int min, int max, double p, int d)
	{
		toyName = n;
		minAge = min;
		maxAge = max;
		price = p;
		daysToMake = d;
	}

	//get methods
	public String getName ()
	{
		return toyName;
	}

	public int getMinAge ()
	{
		return minAge;
	}

	public int getMaxAge ()
	{
		return maxAge;
	}

	public double getPrice()
	{
		return price;
	}

	public int getDays()
	{
		return daysToMake;
	}

	//puts info into a string
	public String toString ()
	{
		String str = "\nToy:  " + toyName;
		str += "\nMinimum age:  " + minAge;
		str += "\nMaximum age:  " + maxAge;
		str += "\nPrice:  " + price;
		str += "\nDays to make:  " + daysToMake;

		return str;
	}
}