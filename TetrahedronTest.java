import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* The Tetrahedron test class which is used to test the intial program 
* in detail.
* M7: Project_07B
* @author James Glass COMP-1213-001
* @version 3/19/21
*/

public class TetrahedronTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }   
 /**
 * Test the set and get Label methods.
 */  
   @Test public void labelTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      a.setLabel("example");
      Assert.assertEquals("Label is not equal", "example", a.getLabel());
      Assert.assertFalse("Allowed invalid value", a.setLabel(null));
   }
   
   /**
   * Tests the setEdge and getEdge methods.
   */
   @Test public void edgeTest() {
      Tetrahedron a = new Tetrahedron("a", 0);
      a.setEdge(2);
      Assert.assertEquals(2.0, a.getEdge(), 1); 
      Tetrahedron b = new Tetrahedron("b", 0);
      Assert.assertFalse("Edge less than 0", b.setEdge(-1));
   }
   
   /**
   * Tests the height method.
   */
   @Test public void heightTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      Assert.assertEquals("Height is not equal", 0.816, a.height(), 1);
   }
   
 /**
 * Tests the surfaceArea method.
 */
   @Test public void surfaceAreaTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      Assert.assertEquals("Surface area is incorrect", 1.732,
         a.surfaceArea(), 1);
   }
   
   /**
   * Tests the volume method.
   */
   @Test public void volumeTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      Assert.assertEquals("Volume is incorrect", 0.118, a.volume(), 1);
   }
   
   /**
   * Tests the toString method.
   */
   @Test public void toStringTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      String toStringTest = "Tetrahedron \"a\" "
         + "with six edges of length 1.0 has:" 
         + "\n\theight = 0.816 units" 
         + "\n\tsurface area = 1.732 square units"
         + "\n\tvolume = 0.118 cubic units";
      Assert.assertEquals("Output string not equal", toStringTest,
         a.toString());
   }
  
   /**
   * Tests the getCount and resetCount methods.
   */
   @Test public void countTest() {
      Tetrahedron.resetCount();
      Assert.assertEquals("Count is not zero", 0, Tetrahedron.getCount());
      Tetrahedron b = new Tetrahedron("b", 1.0);
      Tetrahedron c = new Tetrahedron("c", 2.0);
   }
   
 /**
 * Tests the equals method.
 */
   @Test public void equalsTest() {
      Tetrahedron a = new Tetrahedron("a", 2);
      Tetrahedron b = new Tetrahedron("a", 2);
      Assert.assertTrue(a.equals(b));
      
      Tetrahedron c = new Tetrahedron("a", 1);
      Tetrahedron d = new Tetrahedron("a", 2);
      Assert.assertFalse(c.equals(d));
      
      Tetrahedron e = new Tetrahedron("a", 2);
      Tetrahedron f = new Tetrahedron("f", 2);
      Assert.assertFalse(e.equals(f));
   }
   
   /**
   * Tests the Equals method that is false.
   */
   @Test public void equalsNotTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      Object obj = new Object();
      Assert.assertFalse(a.equals(obj));
   }
   
   /**
   * Tests the hashCode method.
   */
   @Test public void hashCodeTest() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      Assert.assertEquals("hashCode", 0, a.hashCode());
   }
   
   /**
   * Tests the the first compareTo method.
   */
   @Test public void compareToTest1() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      a.volume();
      Tetrahedron b = new Tetrahedron("b", 1.0);
      b.volume();
      Assert.assertTrue(a.compareTo(b) == 0);
   } 
  
   /**
   * Tests the second compareTo method.
   */ 
   @Test public void compareToTest2() {
      Tetrahedron a = new Tetrahedron("a", 1.0);
      a.volume();
      Tetrahedron b = new Tetrahedron("b", 2.0);
      b.volume();
      Assert.assertTrue(a.compareTo(b) < 0);
   }
   
    /**
    * Tests the third compareTo method.
    */
   @Test public void compareToTest3() {
      Tetrahedron a = new Tetrahedron("a", 2.0);
      a.volume();
      Tetrahedron b = new Tetrahedron("b", 1.0);
      b.volume();
      Assert.assertTrue(a.compareTo(b) > 0);
   }
}
