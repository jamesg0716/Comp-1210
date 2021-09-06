/**
* The program for the Invalid Category Exception.
* 
* M11: Project_11
* @author James Glass COMP-1213-001
* @version 4/15/21
*/
public class InvalidCategoryException extends Exception {
/**
* The class contructs the exception.
* @param categoryIn the input.
*/
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}