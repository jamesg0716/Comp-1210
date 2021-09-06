/**
* The SearchEngineMC program which is a child class of IndirectMC.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/
public class SearchEngineMC extends IndirectMC {
/**
* The search engine class from IndirectMC.
*/

// Fields 
/**
* The Base Cost.
*/
   public static final double BASE_COST = 2000.0;

// Constructor
/**
* The constructor for the search engine.
* @param nameIn the input.
* @param revenueIn the input.
* @param costPerAdIn the input.
* @param numberOfAdsIn the input.
*/
   public SearchEngineMC(String nameIn, double revenueIn,
      double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   /**
   * The method for getting base cost of this class.
   * @return the baseCost.
   */
   public double getBaseCost() {
      return SearchEngineMC.BASE_COST;
   }
}
