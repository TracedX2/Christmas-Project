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
        Scanner giftReader = new Scanner (new File("gifts.txt"));
        Scanner kidReader = new Scanner (new File("kids.txt"));
        Scanner reader = new Scanner (System.in);
        PrintWriter kidWriter = new PrintWriter(new File("kidsResults.txt"));
        PrintWriter giftWriter = new PrintWriter(new File("giftsResults.txt"));
        double budget = 0;
        double spent = 0;
        int daysLeft = 0;
        ArrayList<Double> cost = new ArrayList<Double>();
        ArrayList<Integer> min = new ArrayList<Integer>();
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
            	System.out.print(d);
	   		int mi = giftReader.nextInt();
            	min.add(mi);
            int maxAge = giftReader.nextInt();
            	max.add(maxAge);
            double price = giftReader.nextDouble();
            	cost.add(price);
            int time = giftReader.nextInt();
            	days.add((Integer)time);



		}
           /* max.add(n);
            cost.add(n);
            days.add(n);*/
            System.out.println (description);
            System.out.println (min);
            System.out.println (max);
            System.out.println (cost);
            System.out.println (days);

        //get info from user
        System.out.println("What is your budget?");
        budget = reader.nextDouble();
        System.out.println("When would you like these items by?");
        daysLeft = reader.nextInt();

}
}
