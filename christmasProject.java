//am i doing this right i have no clue what is happening i'm actually a mess
import java.io.*;
import java.util.*;
 
public class christmasProject
{
    public static void main(String[]args) throws IOException
    {
        //declare variables
        Scanner giftReader = new Scanner (new File("gifts.txt"));
        Scanner kidReader = new Scanner (new File("kids.txt"));
        PrintWriter kidWriter = new PrintWriter(new File("kidsResults.txt"));
        PrintWriter giftWriter = new PrintWriter(new File("giftsResults.txt"));
        String description;
        int min, max, cost, budget, days, age;
        double budget;
        String name;
        String n;
        
 
        //assign values from text file
        while(giftReader.hasNext())
        {
            description = reader.next();
            min = reader.nextInt();
            max = reader.nextInt();
            cost = reader.nextInt();
            days = reader.nextInt();
 
            System.out.println (description);
            System.out.println (min);
            System.out.println (max);
            System.out.println (cost);
            System.out.println (days);
        }
        while(kidReader.hasNext())
        {
        }
 
        //get info from user
        System.out.println("What is your budget?");
        budget = reader.nextInt();
        System.out.println("When would you like these items by?");
        date = reader.nextInt();
    }
}//i think this works??
