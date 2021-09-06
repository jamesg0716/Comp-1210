import java.util.Comparator;
/**
* Program that implements the Camparator Interface.
*
* M10: Project_10
* @author James Glass COMP-1213-001
* @version 4/08/21
*/
public class ROIComparator implements Comparator<MarketingCampaign> {
/**
* The class implementing the compare method.
* @param c1 Marketing campaign c1.
* @param c2 Marketing Campaign c2.
* @return the ordering.
*/
   public int compare(MarketingCampaign c1, MarketingCampaign c2) {
      if (c1.calcROI() > c2.calcROI()) {
         return -1;
      }
      else if (c1.calcROI() < c2.calcROI()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}
