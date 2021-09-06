import java.text.DecimalFormat;

/** 
 * A program for the Tetrahedron list that has methods, a constructor, and 
 * fields.
 *
 * M8: Project_08
 * @author James Glass COMP-1213-001
 * @version 3/25/21
 */
public class TetrahedronList {
   private String listName = "";
   private Tetrahedron[] tetra;
   private int numObjects = 0;
   
   /**
    * The method for the Tetrahedron List.
   *
   * @param listNameIn input name.
   * @param tetraIn input lists.
   * @param numObjectsIn input number.
   */
   public TetrahedronList(String listNameIn, Tetrahedron[] tetraIn, 
      int numObjectsIn) {
      listName = listNameIn;
      tetra = tetraIn;
      numObjects = numObjectsIn;
   }
   
   /** 
    * The getName method.
    * @return Returns the listname string.
    */
   public String getName() {
      return listName;
   }
   
   /** 
    * The method for the numberOfTetrahedrons.
    * @return Returns the numObjects.
    */
   public int numberOfTetrahedrons() {
      return numObjects;
   }
   /** 
    * Method for the totalSurfaceArea.
    * @return Returns the value for total surface area.
    */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      for (int i = 0; i < numObjects; i++) {
         Tetrahedron a = tetra[i];
         totalSurfaceArea += a.surfaceArea();
      }
      return totalSurfaceArea;
   }
   
   /** 
    * The method for the totalVolume.
    * @return Returns the volume value.
    */
   public double totalVolume() {
      double totalVolume = 0.0;
      for (int i = 0; i < numObjects; i++) {
         Tetrahedron b = tetra[i];
         totalVolume += b.volume();
      }
      return totalVolume;
   }
   
   /** 
    * The averageSurfaceArea method.
    * @return Returns the double value for surface area average.
    */
   public double averageSurfaceArea() {
      double averageSurfaceArea = 0.0;
      if (numObjects != 0) {
         averageSurfaceArea = totalSurfaceArea() / (double) numObjects;
      }
      return averageSurfaceArea;
   }
   
   /** 
    * The average volume method.
    * @return Returns the average volume.
    */
   public double averageVolume() {
      double averageVolume = 0.0;
      if (numObjects != 0) {
         averageVolume = totalVolume() / (double) numObjects;
      }
      return averageVolume;
   }
   
   /** 
    * The method for the toString.
    * @return Returns the string summary.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String summary = "----- Summary for " + getName() + " -----";
      summary += "\nNumber of Tetrahedrons: " + numObjects;
      summary += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea()) 
         + " square units";
      summary += "\nTotal Volume: " + fmt.format(totalVolume()) 
         + " cubic units";
      summary += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea()) 
         + " square units";
      summary += "\nAverage Volume: " + fmt.format(averageVolume()) 
         + " cubic units";
      return summary;   
   }
      
      /** 
       * The method for the Tetrahedron getList.
       * @return Returns the list.
       */
   public Tetrahedron[] getList() {
      return tetra;
   }
      
      /**        
      * The method for adding tetrahedrons.
       * @param labelIn the input label.
       * @param edgeIn the input edge. 
       */
   public void addTetrahedron(String labelIn, double edgeIn) {
      tetra[numObjects++] = new Tetrahedron(labelIn, edgeIn);
   }
      
      /** 
       *
       * @param labelIn the input label.       
       * @return returns the array.
       */
   public Tetrahedron findTetrahedron(String labelIn) {
      for (int i = 0; i < numObjects; i++) {
         if (tetra[i].getLabel().equalsIgnoreCase(labelIn)) {
            return tetra[i];
         }
      }
      return null;
   }
      
      /** 
       * The method for delete Tetrahedron.
       * @param labelIn the input label.
       * @return delete tetra.
       */
   public Tetrahedron deleteTetrahedron(String labelIn) {
      Tetrahedron delete = findTetrahedron(labelIn);
      for (int i = 0; i < numObjects; i++) {
         if (tetra[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int d = i; d < numObjects; d++) {
               tetra[d] = tetra[d + 1];
            }
            tetra[numObjects--] = null;
         }
      }
      return delete;
   }
      
      /**        
       * Method for the edit Tetrahedron.
       * @param labelIn the input label.
       * @param edgeIn the input edge. 
       * @return Returns the edit.
       */
   public boolean editTetrahedron(String labelIn, 
         double edgeIn) {
      boolean edit = false;
      for (int i = 0; i < numObjects; i++) {
         if (tetra[i].getLabel().equalsIgnoreCase(labelIn)) {
            tetra[i].setEdge(edgeIn);
            edit = true;
         }
      }
      return edit;
   }
      
      /** 
       * The method for the findTetrahedron with largest volume. 
       * @return Return the large value.
       */
   public Tetrahedron findTetrahedronWithLargestVolume() {
      if (numberOfTetrahedrons() > 0) {
         Tetrahedron large = tetra[0];
         for (int i = 1; i < numberOfTetrahedrons(); i++) {
            if (tetra[i].volume() > large.volume()) {
            
               large = tetra[i];
            } 
         }
         return large;
      }
      return null;
   }
}