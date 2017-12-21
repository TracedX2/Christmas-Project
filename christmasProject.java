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
        ArrayList<Double> budget = new ArrayList<Double>();
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
        ArrayList<String> behavior = new ArrayList<String>();
        ArrayList<Integer> days = new ArrayList<Integer>();
        String n;


        //assign values from text file
        while(giftReader.hasNext())
        {
			//EG - brings in items from the list and adds it to the Arrays
	   		String d = giftReader.nextLine();
            	description.add(d);
	   		String mi = giftReader.nextLine();
	   			minS.add(mi);
	   			/*
            String maxAge = giftReader.nextLine();
            	max.add(maxAge);
            String price = giftReader.nextLine();
            	cost.add(price);
            String time = giftReader.nextLine();
            	days.add(time);
            	*/



		}

            System.out.println (description);
            System.out.println (minS);
            System.out.println (max);
            System.out.println (cost);
            System.out.println (days);

        //get info from user
        System.out.println("What is your budget?");
        double g = reader.nextDouble();
        budget.add(g);
        System.out.println("When would you like these items by?");
        daysLeft = reader.nextInt();
	
	//cut people from the gift list
        if(age <= 15)
        {
            budget = budget - cost;
        }
        while(!budget.equals(0))
        {
            for(int a = 16; a <= 18; a++)
            {
                if(age.equals(a) && behavior.equals("nice"))
                {
                    budget = budget - cost;
                }
            }
            for(int b = 16; b <= 18; b++)
            {
                if(age.equals(b) && behavior.equals("naughty"))
                {
                    budget = budget - cost;
                }
            }
        }

<<<<<<< HEAD
	//cut people from the gift list
        if(age <= 15)
        {
            budget = budget - cost;
        }
        while(!budget.equals(0))
        {
            for(int a = 16; a <= 18; a++)
            {
                if(age.equals(a) && behavior.equals("nice"))
                {
                    budget = budget - cost;
                }
            }
            for(int b = 16; b <= 18; b++)
            {
                if(age.equals(b) && behavior.equals("naughty"))
                {
                    budget = budget - cost;
                }
            }
        }

=======
>>>>>>> 0927ce69cf89c890c376242bb62711ca159827f2
        if(budget.equals(0))
        {
            System.out.println ("Santa has run out of money");
        }
}
}
