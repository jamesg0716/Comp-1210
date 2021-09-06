import java.text.DecimalFormat;
/**
* The IndirectMC program which is a child class of MarketingCampaign.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/

public class IndirectMC extends MarketingCampaign {
/**
* The class IndirectMC with fields, a constructor, and methods corresponding 
* with Marketing Campaign.
*/

// Fields 
   protected double costPerAd;
   protected int numberOfAds;
/**
* The public field Base Cost.
*/
   public static final double BASE_COST = 1500.0;

// Constructor
/**
* The constructor for IndirectMC.
* @param nameIn the input name.
* @param revenueIn the input.
* @param costPerAdIn the input.
* @param numberOfAdsIn the input.
*/
   public IndirectMC(String nameIn, double revenueIn, 
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
   
   // Methods
   /**
   * The method for getting the cost per ad.
   * @return double representing the cost.
   */
   public double getCostPerAd() {
      return costPerAd;
   }
   
   /**
   * The method for setting the cost per ad.
   * @param costPerAdIn the input.
   */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
   /** 
   * The method for getting number of ads.
   * @return the ads.
   */
   public int getNumberOfAds() {
      return numberOfAds;
   } 
   
   /**
   * The set method for the number of ads.
   * @param numberOfAdsIn the input.
   */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
   
   /**
   * The method for getting base cost.
   * @return the base cost.
   */
   public double getBaseCost() {
      return BASE_COST;
   }
   
   /**
   * The method for campaign cost.
   * @return the campign cost.
   */
   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }
   
   /**
   * The method for the to String.
   * @return the output.
   */
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\n   Base Cost: " 
         + fmt1.format(getBaseCost()) 
         + "\n   Ad Cost: " + fmt1.format(getCostPerAd() * getNumberOfAds()) 
         + " = " + fmt1.format(getCostPerAd()) + " per ad * "
         + getNumberOfAds() + " ads";
      return output;
   
   }
}

