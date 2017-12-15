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
        ArrayList<Double> budget = new ArrayList<Double>();
        ArrayList<Double> cost = new ArrayList<Double>();
        ArrayList<Integer> min = new ArrayList<Integer>();
        ArrayList<Integer> max = new ArrayList<Integer>();
        ArrayList<Integer> days = new ArrayList<Integer>();
        ArrayList<Integer> age = new ArrayList<Integer>();
        ArrayList<String> description = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();
        String n;


        //assign values from text file
        while(giftReader.hasNext())
        {

	   String d = giftReader.next();
            description.add(d);
	    int mi = giftReader.nextInt();
            min.add(mi);

             //Get scanner instance
		Scanner scanner = new Scanner(new File("SampleCSVFile.csv"));

		//Set the delimiter used in file
		scanner.useDelimiter(",");

		//Get all tokens and store them in some data structure
		//I am just printing them
		while (scanner.hasNext())
		{
		    System.out.println (scanner.next());
		}

		//Do not forget to close the scanner
        scanner.close();
		}
           /* max.add(n);
            cost.add(n);
            days.add(n);

            System.out.println (description);
            System.out.println (min);
            System.out.println (max);
            System.out.println (cost);
            System.out.println (days);
        }

        //get info from user
        System.out.println("What is your budget?");
        budget = reader.nextInt();
        System.out.println("When would you like these items by?");
        days = reader.nextInt();
    }
}//i think this works??
*/
}
}
