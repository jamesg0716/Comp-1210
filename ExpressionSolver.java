import java.util.Scanner;

/**
* Program that finds the result of a sepcified equation after reading
* input values for x, y, and z.
*
* Project_02
* @author James Glass COMP-1213-001
* @version 1/27/21
*/
public class ExpressionSolver {

/**
* Converts the users input into the equation to be solved.
* @param args Command line arguments (not used).
*/
   public static void main(String[] args) {
      
      double x, y, z;
      Scanner userInput = new Scanner(System.in);
      
      // display the expression
      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75) / xyz ");
      
      // get user input
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();
      
      // calculate the result of the expression
      if (x * y * z == 0) {
         System.out.println("result is \"undefined\" ");
      }
      
      else {
         System.out.println("result = " + ((9 * x) + 6.25) * ((6 * y) - 4.5) 
            * ((3 * z) + 2.75) / (x * y * z));    
      }
   }
}

