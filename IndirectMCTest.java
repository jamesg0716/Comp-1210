import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* The test program for IndirectMCTest.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/


public class IndirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
* The test for getting cost per ad.
*/
   @Test public void getCostPerAdTest() {
      IndirectMC a = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("test 1", 2.0, a.getCostPerAd(), .000001);
   }
   
   /**
   * The test for setting cost per ad.
   */
   @Test public void setCostPerAdTest() {
      IndirectMC b = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      b.setCostPerAd(4.0);
      Assert.assertEquals("test 2", 4.0, b.getCostPerAd(), .000001);
   }
   
   /**
   * The get number of ads test.
   */
   @Test public void getNumberOfAdsTest() {
      IndirectMC c = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("test 3", 3500, c.getNumberOfAds(), .000001);
   }

/**
* The test for setting number of ads.
*/
   @Test public void setNumberOfAds() {
      IndirectMC d = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      d.setNumberOfAds(3500);
      Assert.assertEquals(d.getNumberOfAds(), 3500.0, 0.01);
   }

/**
* The test for the get base cost.
*/
   @Test public void getBaseCostTest() {
      IndirectMC e = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(e.getBaseCost(), 1500.0, 3.0);
   }

/**
* The test for campaign cost.
*/
   @Test public void campaignCost() {
      IndirectMC f = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals("Cost is not equal", 8500.0, f.campaignCost(), 1.00);
   }

/**
* The to string test.
*/
   @Test public void toStringTest() {
      IndirectMC g = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertTrue("test", g.toString().contains("(class IndirectMC)"));
   }
}
