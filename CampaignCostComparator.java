import java.util.Comparator;
   /**
* The program implementing the Comparator interface for marketing campaign 
* objects. 
*
* M10: Project_10
* @author James Glass COMP-1213-001
* @version 4/08/21
*/
public class CampaignCostComparator implements Comparator<MarketingCampaign> {
/**
* Gives int value for the comparison.
* @param c1 Marketing campaign c1.
* @param c2 Marketing Campaign c2.
* @return the int value. 
*/
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.campaignCost() < c2.campaignCost()) {
         return -1;
      }
      else if (c1.campaignCost() > c2.campaignCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }

}
