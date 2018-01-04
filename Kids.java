
//MADE BY EG - creates kid object to make them easier to work with

public class Kids
{
	//instance variables
	private String name;
	private String behavior;
	private int age;
	private int norn;

	//constructor to initialize instance variables
	public Kids(String n, String b, int a)
	{
		name = n;
		behavior = b;
		age = a;
	}

	//get methods
	public String getName ()
	{
		return name;
	}

	public String getBehavior ()
	{
		return behavior;
	}

	public int getAge ()
	{
		return age;
	}

	//creates a number value for being naughty or nice hence norn(naughtyornice)
	public int setNorn()
	{
		if(behavior.equals("nice"))
		{
			norn = 1;
		}
		else
		norn = 0;

		return norn;
	}

	//puts info into a string
	public String toString ()
	{
		String str = "\nName:  " + name;
		str += "\nBehavior age:  " + behavior;
		str += "\nAge:  " + age;

		return str;
	}
}