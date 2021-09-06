import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/**
* A program that accepts coded ticket information including price, discount, 
* time, date, and seat followed by a description of the ticket.
*
* M3:Project_03 Part B
* @author James Glass
* @version 2/04/21
*/

public class MarsTicket {

/**
* Prompts user to enter the ticket code which will be translated and put into a 
* format giving them the ticket information.
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String ticketCode;
      String price, discount, time, date, seat, ticketDescription, prizenumber;
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      
      if (ticketCode.length() < 26) {
         System.out.println("\n*** Invalid Ticket Code *** "
            + "\nTicket code must have at least 27 characters. ");
      }
      
      else {
         
         // String variables
         ticketDescription = ticketCode.substring(26, ticketCode.length());
         String month, day, year, minute, hour;
         month = ticketCode.substring(15, 17);
         day = ticketCode.substring(17, 19);
         year = ticketCode.substring(19, 23);
         hour = ticketCode.substring(11, 13);
         minute = ticketCode.substring(13, 15);
         seat = ticketCode.substring(23, 26);
         price = ticketCode.substring(0, 9);
         discount = ticketCode.substring(9, 11);
         
         // double variables
         double newPrice = Double.parseDouble(price) / 100;
         double newDiscount = Double.parseDouble(discount) / 100;
         double cost;
         
         // cost equation
         cost = (newPrice - ((newDiscount) * newPrice));
             
         // decimal format for cost, price, and discount
         DecimalFormat fmtCost = new DecimalFormat("$#,##0.00");
         DecimalFormat fmtPrice = new DecimalFormat("$#,##0.00");
         DecimalFormat fmtDiscount = new DecimalFormat("0%");
         
         // randomizes prize number
         int prize;
         Random generator = new Random();
         prize = generator.nextInt(999999);
         DecimalFormat pz = new DecimalFormat("000000");
         
         // prints all ticket information
         System.out.println("\nTicket: " + ticketDescription + "   Date: " 
            + month + "/" + day + "/" + year + "   Time: " + hour + ":"
            + minute + "\nSeat: " + seat + "   Price: "
            + fmtPrice.format(newPrice) + "   Discount: "
            + fmtDiscount.format(newDiscount) + "   Cost: " 
            + fmtCost.format(cost) + "\nPrize Number: " + pz.format(prize));
      }
   }
}