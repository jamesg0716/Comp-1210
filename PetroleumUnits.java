import java.util.Scanner;

/**
* A program that allows a user to eneter an amount of petroleum in 
* ounces less than one billion. The program then displays the number of
* barrels, gallons, quarts, and ounces which is maximized from the 
* smallest to largest in size.
*
* @author James Glass COMP-1213-001
* @version 1/28/21
*/

public class PetroleumUnits {

/**
* Prompts the user to enter an amount of petroleum in ounces which will
* be converted in the equation.
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int amount;
               
      // prompt for amount in ounces
      System.out.print("Enter amount of petroleum in ounces: ");
      amount = userInput.nextInt();
      int barrels;
      barrels = amount / 5376;
      int gallons;
      gallons = (amount % 5376) / (128);
      int quarts;
      quarts = ((amount % 5376) % (128)) / (32);
      int ounces;
      ounces = ((amount % 5376) % (128)) % (32);
       
      // maximizes ounces in barrels, gallons, quarts, ounces
      if (amount > 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000. ");
      }
      
      else {
         System.out.println("Petroleum amount in units: ");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         System.out.println(amount + " oz = (" + barrels + " bl * 5376 oz) "
            + "+ (" + gallons + " gal * 128 oz) + "
            + "(" + quarts + " qt * 32 oz) + (" + ounces + " oz)");
      }
   }
}