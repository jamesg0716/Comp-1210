import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* The program used to test the Tetrahedron list.
*
*M8: Project_08
* @author James Glass COMP-1213-001
* @version 3/25/21
*/
public class TetrahedronListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   
   }
   

    /** 
    * The test for the getName method.
    */
   @Test public void getNameTest() {
   
      Tetrahedron[] a = new Tetrahedron[20];
      a[0] = new Tetrahedron("testa", 1.0);
      a[1] = new Tetrahedron("testb", 1.0);
      a[2] = new Tetrahedron("testc", 1.0);
      TetrahedronList list1 = new TetrahedronList("list1", a, 3);
      Assert.assertEquals("getName Test", "list1", list1.getName());
   }
   
   /** 
    * The test for the number of tetrahedrons.
    */
   @Test public void numberOfTetrahedronsTest() {
   
      Tetrahedron[] b = new Tetrahedron[20];
      b[0] = new Tetrahedron("testa", 1.0);
      b[1] = new Tetrahedron("testb", 1.0);
      b[2] = new Tetrahedron("testc", 1.0);
      TetrahedronList list2 = new TetrahedronList("list2", b, 3);
      Assert.assertEquals("numberOfTetrahedrons Test",
                           3, list2.numberOfTetrahedrons(), .0001);
   }
   
   /** 
    * The test for the totalSurfaceArea.
    */
   @Test public void totalSurfaceAreaTest() {
      Tetrahedron[] c = new Tetrahedron[20];
      c[0] = new Tetrahedron("testa", 1.0);
      c[1] = new Tetrahedron("testb", 1.0);
      c[2] = new Tetrahedron("testc", 1.0);
      TetrahedronList list3 = new TetrahedronList("list3", c, 3);
      Assert.assertEquals("totalSurfaceArea Test",
                           5.1961, list3.totalSurfaceArea(), .0001);
   }
   
   /** 
    * The test for the averageSurfaceArea.
    */
   @Test public void averageSurfaceAreaTest() {
   
      Tetrahedron[] d = new Tetrahedron[20];
      d[0] = new Tetrahedron("testa", 1.0);
      d[1] = new Tetrahedron("testb", 1.0);
      d[2] = new Tetrahedron("testc", 1.0);
      TetrahedronList list4 = new TetrahedronList("list4", d, 3);
      Assert.assertEquals("averageSurfaceArea Test",
                           1.7320, list4.averageSurfaceArea(), .0001);
                           
      TetrahedronList list5 = new 
         TetrahedronList("list5", null, 0);
      Assert.assertEquals("averageSurfaceArea Test2",
                           0, list5.averageSurfaceArea(), .0001);
   }
   
   /** 
    * The test for the totalVolume method.
    */
   @Test public void totalVolumeTest() {
   
      Tetrahedron[] e = new Tetrahedron[20];
      e[0] = new Tetrahedron("testa", 1.0);
      e[1] = new Tetrahedron("testb", 1.0);
      e[2] = new Tetrahedron("testc", 1.0);
      TetrahedronList list6 = new TetrahedronList("list6", e, 3);
      Assert.assertEquals("totalVolume Test",
                           0.3535, list6.totalVolume(), .0001);
   }
   
   /** 
    * The test for the average volume method.
    */
   @Test public void averageVolumeTest() {
   
      Tetrahedron[] f = new Tetrahedron[20];
      f[0] = new Tetrahedron("testa", 1.0);
      f[1] = new Tetrahedron("testb", 1.0);
      f[2] = new Tetrahedron("testc", 1.0);
      TetrahedronList list7 = new TetrahedronList("list7", f, 3);
      Assert.assertEquals("averageVolume Test",
                           0.1178, list7.averageVolume(), .0001);
                           
      TetrahedronList list8 = new 
         TetrahedronList("list8", null, 0);
      Assert.assertEquals("averageVolume Test2",
                           0, list8.averageVolume(), .0001);
   }
   
   /** 
    * The test for the toString method.
    */
   @Test public void toStringTest() {
   
      Tetrahedron[] g = new Tetrahedron[20];
      g[0] = new Tetrahedron("test", 1.0);
      g[1] = new Tetrahedron("testb", 1.0);
      g[2] = new Tetrahedron("testc", 1.0); 
      TetrahedronList list9 = new TetrahedronList("test list", g, 3);
      Assert.assertEquals("toString test", 
                           true, 
                           list9.toString().contains("----- Summary" 
                              + " for test list -----"));
   }
   
   /** 
    * The test for the getList method.
    */
   @Test public void getListTest() {
   
      Tetrahedron[] h = new Tetrahedron[20];
      h[0] = new Tetrahedron("testa", 1.0);
      h[1] = new Tetrahedron("testb", 1.0);
      h[2] = new Tetrahedron("testc", 1.0); 
      TetrahedronList list10 = new TetrahedronList("list10", h, 3); 
      Assert.assertArrayEquals("getList Test",
                           h, list10.getList());
   }
   
   /** 
    * The method test for adding tetrahedrons.
    */
   @Test public void addTetrahedronTest() {
   
      Tetrahedron[] i = new Tetrahedron[20];
      i[0] = new Tetrahedron("testa", 8.0);
      i[1] = new Tetrahedron("testb", 1.0);
      i[2] = new Tetrahedron("testc", 7.0); 
      TetrahedronList list11 = new TetrahedronList("list11", i, 3);
      Tetrahedron t2 = new Tetrahedron("testd", 1.0);
      list11.addTetrahedron("testd", 1.0);
      Tetrahedron[] sA = list11.getList();
      Assert.assertEquals("addTetrahedron Test",
                           t2, sA[3]);
   }
     
     /** Test the findTetrahedron method in TetrahedronList.
      *
      */
   @Test public void findTetrahedronTest() {
      Tetrahedron[] j = new Tetrahedron[20];
      j[0] = new Tetrahedron("test", 8.0);
      j[1] = new Tetrahedron("testb", 1.0);
      j[2] = new Tetrahedron("testc", 7.0);
      TetrahedronList list12 = new TetrahedronList("test list", j, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0); 
      Assert.assertEquals("findTetrahedron true Test",
                           t2, list12.findTetrahedron("test"));
                           
      Assert.assertEquals("findTetrahedron false Test",
                           null, list12.findTetrahedron("false"));
   
   }
      
     /** 
      * The test for the deleteTetrahedron methods.
      */
   @Test public void deleteTetrahedronTest() {
     
      Tetrahedron[] k = new Tetrahedron[20];
      k[0] = new Tetrahedron("test", 8.0);
      k[1] = new Tetrahedron("testb", 1.0);
      k[2] = new Tetrahedron("testc", 7.0);
      TetrahedronList list13 = new TetrahedronList("test list", k, 3);
      Tetrahedron t2 = new Tetrahedron("testd", 1.0);
      Tetrahedron t3 = new Tetrahedron("test", 8.0);
      list13.addTetrahedron("testd", 1.0);
      Tetrahedron[] sA = list13.getList();
      
      Assert.assertEquals("pre deleteTetrahedron Test",
                           t2, sA[3]);         
   
      Assert.assertEquals("deleteTetrahedron true Test",
                           t3, list13.deleteTetrahedron("test"));
   
      Assert.assertEquals("deleteTetrahedron true Test",
                           t2, sA[2]);
   
      Assert.assertEquals("deleteTetrahedron false Test",
                           null, list13.deleteTetrahedron("false"));
   }
      
      /** 
       * The test for the editTetrahedron Test.
       */
   @Test public void editTetrahedronTest() {
      
      Tetrahedron[] l = new Tetrahedron[20];
      l[0] = new Tetrahedron("test", 8.0);
      l[1] = new Tetrahedron("testb", 1.0);
      l[2] = new Tetrahedron("testc", 7.0);
         
      TetrahedronList list14 = new TetrahedronList("test list", l, 3);
      Tetrahedron t2 = new Tetrahedron("test", 8.0);
      Tetrahedron t3 = new Tetrahedron("test", 9.0);
      Tetrahedron[] sA = list14.getList();
         
      Assert.assertEquals("pre editTetrahedron Test",
                              t2, sA[0]);
      Assert.assertEquals("editTetrahedron true Test",
                              true, list14.editTetrahedron("test", 9.0));
      Assert.assertEquals("editTetrahedron true Test",
                              t3, sA[0]);
      Assert.assertEquals("findTetrahedron false Test",
                           false, list14.editTetrahedron("false", 9.0));
   }
      
      /**        
      * The test for the findlargest volume.
      */
   @Test public void findTetrahedronWithLargestVolume() {
      
      Tetrahedron[] m = new Tetrahedron[20];
      m[0] = new Tetrahedron("test", 7.0);
      m[1] = new Tetrahedron("testb", 1.0);
      m[2] = new Tetrahedron("testc", 8.0);
         
      Tetrahedron t2 = new Tetrahedron("test", 7.0);
      Tetrahedron t3 = new Tetrahedron("testb", 1.0);
      Tetrahedron t4 = new Tetrahedron("testc", 8.0);  
      TetrahedronList list1 = new TetrahedronList("test list", m, 3);
      Assert.assertEquals("findTetrahedronWithLargestVolumeTrueTest", t4, 
         list1.findTetrahedronWithLargestVolume());                             
      TetrahedronList tlist = new 
            TetrahedronList("test list", null, 0);
      Assert.assertEquals("findTetrahedronWithLargestVolumeFalseTest",
                              null, 
                              tlist.findTetrahedronWithLargestVolume());
   }
}


   
