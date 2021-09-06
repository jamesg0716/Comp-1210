import java.text.DecimalFormat;
/**
* The abstract parent program that describes marketing campaign data and 
* methods to access the data.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/
public abstract class MarketingCampaign {
/**
* Class containing fields, a constructor and methods for the marketing 
* campaign.
*/

// Fields 
   protected String name = "";
   protected double revenue = 0;
   protected static int count = 0;

// Constructor 
/**
* The constructor for Marketing Campaign.
* @param nameIn the input name.
* @param revenueIn the input revenue.
*/
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
   // Methods 
   /**
   * The method for getting the name.
   * @return Returns the name.
   */
   public String getName() {
      return name;
   }
   
   /**
   * The method for setting the name.
   * @param nameIn the input name.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * The method for getting the revenue.
   * @return the double value for the revenue.
   */
   public double getRevenue() {
      return revenue;
   }
   
   /**
   * The method for setting the revenue.
   * @param revenueIn the input for revenue.
   */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /**
   * The method for getting the count off Marketing Campaign objects.
   * @return the count.
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * The method that resets the count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * The method for calculating the ROI.
   * @return The ROI value.
   */
   public double calcROI() {
      return ((revenue - campaignCost()) / campaignCost());
   }
  
  /**
  * The toString method.
  * @return the desired string output.
  */
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
      DecimalFormat fmt2 = new DecimalFormat("0.##%");
      String result = getName() + " (" + this.getClass() + ")\n"
         + "Revenue: " + fmt1.format(getRevenue()) + "   Campaign Cost: "
         + fmt1.format(campaignCost()) + "   ROI: "
         + fmt2.format(calcROI());
      return result;
   }
  
  /**
  * The abstract method for campaignCost.
  * @return the cost.
  */ 
   public abstract double campaignCost();


/**
* The compareTo method.
* @param object the Marketing Campaign object for comparison.
* @return the compareTo.
*/
   public int compareTo(MarketingCampaign object) {	  	
      return this.getName().toLowerCase().compareTo(object.getName()	  	
             .toLowerCase());	  	
   }	  	
}