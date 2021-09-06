import java.util.ArrayList;
import java.util.Scanner; 
import java.io.File;
import java.io.IOException;
/**
* A program that uses ConeList and runs as an applictaion. 
*
* M5: Project_05
* @author James Glass
* @version 2/17/21
*/

public class ConeListApp {
/**
* Prints out the information of the cone list.
* @param args Command line arguments (not used).
* @throws IOException for scanning file title.
*/
   public static void main(String[] args) throws IOException {
      String coneListName = "";
      String labelIn = "";
      double heightIn = 0;
      double radiusIn = 0;
      ArrayList<Cone> myList = new ArrayList<Cone>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      System.out.print("\n");
      Scanner scanFile = new Scanner(new File(fileName));
      coneListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         labelIn = scanFile.nextLine();
         heightIn = Double.parseDouble(scanFile.nextLine());
         radiusIn = Double.parseDouble(scanFile.nextLine());
         Cone myCone = new Cone(labelIn, heightIn, radiusIn);
         myList.add(myCone);
      }
      ConeList cList = new ConeList(coneListName, myList);
      System.out.println(cList.toString());
      System.out.println("");
      System.out.println(cList.summaryInfo());
   }
}