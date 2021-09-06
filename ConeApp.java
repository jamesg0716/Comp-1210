import java.util.Scanner;

/**
* A program that allows to user to input given values for label, height and
* radius. It outputs information form the Cone.
*
* M4: Project_04 Part 2
* @author James Glass COMP-1213-001
* @version 2/12/21
*/
public class ConeApp {
/**
* Prompts the user to enter values which will be displayed as the 
* cone is described.
* @param args Command line arguments (not used).
*/

   public void main(String[] args) {
      double height;
      double radius;
      
      Scanner userInput = new Scanner(System.in);
      // prompts user to input label
      System.out.println("Enter label, height, and radius for a cone.");
      System.out.print("label: ");
      String label = userInput.nextLine();
      // prompts user to input height value
      System.out.print("height: ");
      height = Double.parseDouble(userInput.nextLine());
      if (height <= 0) {
         System.out.println("Error: height must be greater than 0.");
         return;
      } 
      System.out.print("radius: ");
      radius = Double.parseDouble(userInput.nextLine());
      if (radius <= 0) {
         System.out.println("Error: radius must be greater than 0.");
         return;
      } 
      //instance methods
      Cone newCone = new Cone(label, height, radius);
      System.out.println(newCone.toString());
   }
}