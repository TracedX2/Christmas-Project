import java.io.*;
import java.util.*;
///////////////////////////////////////////////////////////////////////////////////////////////////
/*The program complies and runs but when its running it does have an index out of bounds array*/
//////////////////////////////////////////////////////////////////////////////////////////////////

public class christmasProject
{
    public static void main(String[]args) throws IOException
    {
        //declare variables
	    //DDZ created printwriters to help read in files
        //EG - created seperate scanners so that we could read in the files and user input
        Scanner giftReader = new Scanner (new File("gifts.txt"));
        Scanner kidReader = new Scanner (new File("kids.txt"));
        Scanner reader = new Scanner (System.in);
        PrintWriter kidWriter = new PrintWriter(new File("kidsResults.txt"));
        PrintWriter giftWriter = new PrintWriter(new File("giftsResults.txt"));
        //RF - changed budget from ArrayList to a double
        double budget;
        double spent = 0;
        int daysLeft = 0;
        //EG - created array lists to hold all of the data
        ArrayList<Double> cost = new ArrayList<Double>();
        ArrayList<String> minS = new ArrayList<String>();
        ArrayList<Integer> minint = new ArrayList<Integer>();
        ArrayList<Integer> max = new ArrayList<Integer>();
        ArrayList<Integer> age = new ArrayList<Integer>();
        ArrayList<String> description = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> kids = new ArrayList<String>();
        ArrayList<String> behavior = new ArrayList<String>();
        ArrayList<Integer> days = new ArrayList<Integer>();
        ArrayList<Presents> presentList = new ArrayList<Presents>();
        //RF - array list to store kids under 15
        ArrayList<Integer> underAge = new ArrayList<Integer>();
        String n;
        double totalCost = 0;
        //end EG
        //DDZ- create printwriters to create an output file
        File file = new File("Output.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        PrintWriter pw = new PrintWriter(dos);

	    //assign values from text file
	    while(giftReader.hasNext())
	    {
	   	//EG - brings in items from the list and adds it to the Arrays
	   	String d = giftReader.nextLine();
	        	description.add(d);

	   	String mi = giftReader.nextLine();
	   	int minInt = Integer.parseInt(mi);
	   		minS.add(mi);

	        String maxAge = giftReader.nextLine();
	        int ageInt = Integer.parseInt(maxAge);
	        	max.add(ageInt);

	        String price = giftReader.nextLine();
	        double dollars = Double.parseDouble(price);
	        totalCost = totalCost + dollars;
	        	cost.add(dollars);

	        String time = giftReader.nextLine();
	        int amountOfDays = Integer.parseInt(time);
	        	days.add(amountOfDays);



		}

		System.out.println(totalCost + "Total cost is right here ");

		//EG - Started the while loop to add the kids
		//EG - thinking about creating other files to have objects like a present object and a child object
		while(kidReader.hasNext())
		{
			String kid = kidReader.nextLine();
			kids.add(kid);
		}
		//end EG


        //get info from user DDZ
        System.out.println("What is your budget?");
        budget = reader.nextDouble();
        System.out.println("How many days till Christmas");//EG rewrote question
        daysLeft = reader.nextInt();

	//cut people from the gift list
	//DDZ - helped RF set up loops and added variables for later output
	//RF - used for each loops to loop through ArrayLists and cut people from the lists and changed some bad operand errors
	//EG - (Check loops for working condition it seems to be endless)
	//RF - fixed this first loop it works now
    for (int i = 0; i < age.size(); i++)
	{
		if(age.get(i) <= 15)
		{
			underAge.add(age.get(i));
		}
	}

	for (int x = 0; x < cost.size(); x++)
	{
		budget = budget - cost.get(x);
		spent = spent + cost.get(x);
	}
	System.out.println(budget);
	System.out.println(spent);

        while(budget != 0)
        {
            for(int a = 16; a <= 18; a++)
            {
                if(age.equals(a) && behavior.equals("nice"))
                {
					System.out.println("LOOK HERE");
					for(double d: cost)
					{
                    	budget = budget - d;
                    	spent = spent + d;
					}
                }
            }
            for(int b = 16; b <= 18; b++)
            {
                if(age.equals(b) && behavior.equals("naughty"))
                {
					//RF - for each loop
					for(double d: cost)
					{
                    	budget = budget - d;
                    	spent = spent + d;
					}
                }
            }
        }
	//cut people from the gift list
    for(int i: age)
    {
        if(i <= 15)
        {
			//RF - for each loop
			for(double d: cost)
			{
            	budget = budget - d;
            	spent = spent + d;
            }
        }
	}
        while(budget != 0)
        {
            for(int a = 16; a <= 18; a++)
            {
                if(age.equals(a) && behavior.equals("nice"))
                {
					//RF - for each loop
					for(double d: cost)
					{
                   		budget = budget - d;
                   		spent = spent + d;
					}
                }
            }
            for(int b = 16; b <= 18; b++)
            {
                if(age.equals(b) && behavior.equals("naughty"))
                {
					//RF - for each loop
					for(double d: cost)
					{
                    	budget = budget - d;
                    	spent = spent + d;
					}
                }
            }
        }
        if(budget == 0)
        {
            System.out.println ("Santa has run out of money");
        }
        //end RF

		//DDZ- print info to output files and close files
		dos.writeDouble(budget);
		dos.writeDouble(spent);
		dos.close();
	}
}
