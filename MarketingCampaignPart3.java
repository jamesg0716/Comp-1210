import java.io.FileNotFoundException;
/**
* Program used as the driver class with the main method.
*
* M11: Project_11
* @author James Glass COMP-1213-001
* @version 4/15/21
*/
public class MarketingCampaignPart3 {
/**
* This class contains the main method for running the program.
* @param args Command line arguments.
* @throws FileNotFoundException throws it.
*/

   public static void main(String[] args) throws FileNotFoundException {
      try {
         if (args.length > 0) {
            String fileName = args[0];
            MarketingCampaignList list1 = new MarketingCampaignList();
            list1.readFile(args[0]);
            System.out.print(list1.generateReport());
            System.out.println();
            System.out.println(list1.generateReportByName());
            System.out.println();
            System.out.println(list1.generateReportByCampaignCost());
            System.out.println();
            System.out.println(list1.generateReportByROI());
            System.out.println();
            System.out.println(list1.generateInvalidRecordsReport());
            System.out.println();
         }
            
         else {
            System.out.println("File name expected as command line argument."
               + "\nProgram ending.");
         }
              
      }
      catch (FileNotFoundException notFound) {
         String fileName = args[0];
         System.out.println("*** Attempted to read file: "
            + fileName + " (No such file or directory)");
      }
   
   }
}
