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
        String description;
        int min, max, cost, days, age;
        double budget;
        String name;
        String n;


        //assign values from text file
        while(giftReader.hasNext())
        {
            description = giftReader.next();
            min = giftReader.nextInt();
            max = giftReader.nextInt();
            cost = giftReader.nextInt();
            days = giftReader.nextInt();

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
        days = reader.nextInt();
    }
}//i think this works??
