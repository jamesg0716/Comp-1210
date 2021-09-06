import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* The test program for DirectMCTest.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/


public class DirectMCTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/**
* The get and set cost per mail piece test.
*/
   @Test public void getAndSetCostPerMailPieceTest() {
      DirectMC a = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      a.setCostPerMailPiece(3);
      Assert.assertEquals("test 1", 3.00, a.getCostPerMailPiece(), .000001);
   }
 
  /**
  * The test for NumberOfMailPieces.
  */ 
   @Test public void getAndSetNumberOfMailPiecesTest() {
      DirectMC b = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      b.setNumberOfMailPieces(2000);
      Assert.assertEquals("test 2", 2000, b.getNumberOfMailPieces(), 1);
   }
   
   /**
   * The test for campaign cost method.
   */
   @Test public void campaignCostTest() {
      DirectMC c = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("test 3", c.campaignCost(), 7000, 1);
   }
   
   /**
   * Test for the get and set name method.
   */
   @Test public void getAndSetNameTest() {
      DirectMC d = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      d.setName("AdMailing");
      Assert.assertEquals("test 4", d.getName(), "AdMailing");
   }
   
   /**
   * Test for the get and set revenue methods.
   */
   @Test public void getAndSetRevenueTest() {
      DirectMC e = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      e.setRevenue(10000);
      Assert.assertEquals(10000, e.getRevenue(), 1); 
   }
   
   /**
   * Test for the get count method.
   */
   @Test public void getCountTest() {
      DirectMC f = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(f.getCount(), 5.0, 1);
   }
   
   /**
   * Test for the reset count method.
   */
   @Test public void resetCountTest() {
      DirectMC g = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      g.resetCount();
      Assert.assertEquals(0, g.getCount(), 1);
   }
   
   /**
   * Test for the calcROI method. 
   */
   @Test public void calcROItest() {
      DirectMC h = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(.4286, h.calcROI(), 1);
   }
   
   /**
   * Test for the toString Method.
   */ 
   @Test public void toStringTest() {
      DirectMC i = new DirectMC("AdMailing", 10000.00, 3.00, 2000);
      Assert.assertTrue("test", i.toString().contains("(class DirectMC)"));
   }
   
}
