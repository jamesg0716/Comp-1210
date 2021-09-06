import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* The test program for SearchEngineMC.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/


public class SearchEngineMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * The test for getting base cost.
   */
   @Test public void getBaseCostTest() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2",
         27500.00, 2.50, 5000);
      Assert.assertEquals(mc2.getBaseCost(), 2000.0, 1.0);
   }

}
