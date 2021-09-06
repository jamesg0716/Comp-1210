import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
/**
* The program that provides methods for reading in data files and 
* generating reports.
*
* M10: Project_10
* @author James Glass COMP-1213-001
* @version 4/08/21
*/

public class MarketingCampaignList {
/**
* Contains the fields, methods, and a constructor for reading and repoting 
* the files.
*/

// Fields
   private MarketingCampaign[] mcObject;
   private String[] invalidRecords;

/**
* The constructor for marketing campaign list.
*/
   public MarketingCampaignList() {
      mcObject = new MarketingCampaign[0];
      invalidRecords = new String[0];
   }
  
  /**
  * The get marketing campaign array method.
  * @return the mcObject for the array.
  */ 
   public MarketingCampaign[] getMarketingCampaignArray() {
      return mcObject;
   }
   
   /**
   * The method for getting invalid records.
   * @return rhe invalid records.
   */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
  
  /**
  * The add Marketing Campaign method.
  * @param objectIn the mc object.
  */ 
   public void addMarketingCampaign(MarketingCampaign objectIn) {
      if (objectIn != null) {
         mcObject = Arrays.copyOf(getMarketingCampaignArray(),
            getMarketingCampaignArray().length + 1); 
         mcObject[getMarketingCampaignArray().length - 1] = objectIn;
      }
   
   }
   /**
   * The method for adding invalid records.
   * @param recordIn the record.
   */
   public void addInvalidRecord(String recordIn) {
      if (recordIn != null) {
         invalidRecords = Arrays.copyOf(invalidRecords, 
            invalidRecords.length + 1);
         invalidRecords[invalidRecords.length - 1] = recordIn;
      }
   }
   
   /**
   * The method used for reading the files.
   * @param fileNameIn the name of the file.
   * @throws FileNotFoundException the exception.
   */
   public void readFile(String fileNameIn) throws FileNotFoundException {
      String aIn = "";
      Scanner scan = new Scanner(new File(fileNameIn));
      
      while (scan.hasNext()) {
         String temp = "";
         String result = "";
         char type = 'z';
         String name = "";
         double revenue = 0.0;
         double cost = 0.0;
         int number = 0;
         String tempRevenue = "";
         String tempCost = "";
         String tempNumber = "";
         aIn = scan.nextLine();
         Scanner scan1 = new Scanner(new String(aIn));
         scan1.useDelimiter(",");
         
         try {
            temp = scan1.next();
            type = temp.charAt(0);
            name = scan1.next();
            tempRevenue = scan1.next();
            tempCost = scan1.next();
            tempNumber = scan1.next();
            revenue = Double.parseDouble(tempRevenue);
            cost = Double.parseDouble(tempCost);
            number = Integer.parseInt(tempNumber);
         
         
            switch(type) {
               case 'D': 
                  DirectMC mc1 = new DirectMC(name, revenue, cost, number);
                  this.addMarketingCampaign(mc1);
                  break;
               
               case 'I':
                  IndirectMC mc2 = new IndirectMC(name, revenue, cost, number);
                  this.addMarketingCampaign(mc2);
                  break;
               
               case 'S':
                  SearchEngineMC mc3 = new SearchEngineMC(name, revenue,
                     cost, number);
                  this.addMarketingCampaign(mc3);
                  break;
               
               case 'M':
                  SocialMediaMC mc4 = new SocialMediaMC(name, revenue,
                     cost, number);
                  this.addMarketingCampaign(mc4);
                  break;
               
               default:
                  InvalidCategoryException b = new 
                     InvalidCategoryException(String.valueOf(type));
                  String invalid = aIn;
                  invalid += "\n" + b;
                  addInvalidRecord(invalid);
                  break;
            }
         }
         
         catch (NumberFormatException b) {
            String invalid = aIn;
            invalid += "\n" + b;
            addInvalidRecord(invalid);
         }
         
         catch (NoSuchElementException b) {
            String invalid = aIn;
            invalid += "\n" + b;
            invalid += ": For missing input data";
            addInvalidRecord(invalid);
         }
      }
      
   } 
   /**
   * The method used for generating the report.
   * @return the resulting report.
   */
   public String generateReport() {
      String result = "-------------------------------"
         + "\nMarketing Campaign Report"
         + "\n-------------------------------\n";
      int i = 0;
      while (i < mcObject.length) {
         result += "\n" + mcObject[i].toString() + "\n";
         i++;
      }
      return result;
   }   

/**
* The method used for generating the report by name.
* @return the generated result.
*/
   public String generateReportByName() {
      String result = "-----------------------------------------\n"
         + "Marketing Campaign Report (by Name)\n"
         + "-----------------------------------------";
      String[] n = new String[mcObject.length];
      for (int i = 0; i < mcObject.length; i++) {
         n[i] = mcObject[i].getName();
      }
      Arrays.sort(n);
      int i = 0;
      while (i < mcObject.length) {
         for (MarketingCampaign markC: mcObject) {
            if (markC.getName() == n[i]) {
               result += "\n\n" + markC.toString();
            }
         }
         i++;
      }
      return result;
   }

/**
* The generate report by campaign cost method.
* @return the String result generated cost.
*/
   public String generateReportByCampaignCost() {
      String result = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Lowest Campaign Cost)\n"
         + "-------------------------------------------------";
      double[] c = new double[mcObject.length];
      for (int i = 0; i < mcObject.length; i++) {
         c[i] = mcObject[i].campaignCost();
      }
      Arrays.sort(c);
      int i = 0;
      while (i < mcObject.length) {
         for (MarketingCampaign markC: mcObject) {
            if (markC.campaignCost() == c[i]) {
               result += "\n\n" + markC.toString();
            }
         }
         i++;
      }
      return result;
   }
   /**
   * The method used to generate the report by ROI.
   * @return the String result for report.
   */
   public String generateReportByROI() {
      String result = "-------------------------------------------------\n"
         + "Marketing Campaign Report (by Highest ROI)\n"
         + "-------------------------------------------------";
      double[] r = new double[mcObject.length];
      for (int i = 0; i < mcObject.length; i++) {
         r[i] = mcObject[i].calcROI();
      }
   
      Arrays.sort(r);
      int i = mcObject.length - 1;
   
      while (i > -1) {
         for (MarketingCampaign markC: mcObject) {
            if (markC.calcROI() == r[i]) {
               result += "\n\n" + markC.toString();
            }
         }
         i--;
      }
      return result;
   }
   
   /**
   * The method for generating invlaid records report.
   * @return the result of the report.
   */
   public String generateInvalidRecordsReport() {
      String result = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------";
      int i = 0;
      while (i < invalidRecords.length) {
         result += "\n\n" + invalidRecords[i].toString();
         i++;
      }
      return result;
   }
   
}
