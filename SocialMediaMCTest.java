import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* The test program for SocialMediaMC.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/


public class SocialMediaMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
* The test for getting base cost.
*/
   @Test public void getBaseCostTest() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3",
         35000.00, 3.00, 8000);
      Assert.assertEquals(mc3.getBaseCost(), 3000.0, 1.0);
   }

}
