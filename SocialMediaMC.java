/**
* The SocialMediaMC program which is a child class of IndirectMC.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/

public class SocialMediaMC extends IndirectMC {
/**
* The Social Media MC class.
*/

// Fields
/**
* The Base Cost for this class.
*/
   public static final double BASE_COST = 3000.0;

// Constructor
/**
* The costructor for SocialMediaMC.
* @param nameIn the input.
* @param revenueIn the input.
* @param costPerAdIn the input.
* @param numberOfAdsIn the input.
*/
   public SocialMediaMC(String nameIn, double revenueIn,
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   
   // Methods
   /**
   * The method for getting the base cost.
   * @return the base cost.
   */
   public double getBaseCost() {
      return BASE_COST;
   }
   
}
