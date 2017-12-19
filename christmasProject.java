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
        //EG - created seperate scanners so that we could read in the files and user input
        Scanner giftReader = new Scanner (new File("gifts.txt"));
        Scanner kidReader = new Scanner (new File("kids.txt"));
        Scanner reader = new Scanner (System.in);
        PrintWriter kidWriter = new PrintWriter(new File("kidsResults.txt"));
        PrintWriter giftWriter = new PrintWriter(new File("giftsResults.txt"));
        double budget = 0;
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
        budget = reader.nextDouble();
        System.out.println("How many days till Christmas?");
        daysLeft = reader.nextInt();

}
}
