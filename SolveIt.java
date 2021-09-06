import java.util.Scanner;
import java.text.DecimalFormat;

/**
* A program that solves for the given equation after the user inputs a 
* number for the value x. The program will also count the numbers 
* on either side of the decimal.
*
* M3: Project_03 Part A
* @author James Glass COMP-1213-001
* @version 2/04/21
*
*/

public class SolveIt {

/**
* Prompts the user to input a value for x and the expression will be 
* solved based on that value.
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x;
      double result;
      String numbers;
      String numbersleft;
      String numbersright;
      int numL;
      int numR;
      
      // user inputs a value for x 
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      result = ((6 * (Math.pow(x, 3))) + (Math.sqrt((3 * (x * x))
       + (2 * x) + 1))) / (Math.abs(2 * x) + 4);
     
      // prints equation results
      System.out.println("Result: " + result);
      numbers = Double.toString(result);
      int index = numbers.indexOf('.');
      numbersleft = numbers.substring(0, index);
      numbersright = numbers.substring(index + 1, numbers.length());
      numL = numbersleft.length();
      numR = numbersright.length();
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      // prints numbers to the left and right of decimal
      System.out.println("# of characters to left of decimal point: " + numL);
      System.out.println("# of characters to right of decimal point: " + numR);
      
      // prints formatted result
      System.out.println("Formatted Result: " + df.format(result));    
   }
}