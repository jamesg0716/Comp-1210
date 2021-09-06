import java.text.DecimalFormat;
/**
* A program that stores the Tetrahedron class including a set of methods and
* fields. It will also be tested using the JUnit features.
*
* M7: Project_07B
* @author James Glass COMP-1213-001
* @version 3/19/21
*/
public class Tetrahedron implements Comparable<Tetrahedron> {
/**
* A class that stores the label and edge, and has a set of methods and fields.
*/
   private String label = "";
   private double edge = 0;
   private static int count = 0;
   
   // Constructor
   /**
   * The Tetrahedron constructor.
   * @param labelIn the input label.
   * @param edgeIn the input label for edge.
   */ 
   public Tetrahedron(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
   // Methods
   /**
   * The get label method. 
   * @return Returns a string value for the label field.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * Method for a boolean type of setLabel.
   * @param labelIn the input for label.
   * @return Returns a true or false value.
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   /**
   * Method for the double getEdge.
   * @return Returns a double representing the edge field.
   */
   public double getEdge() {
      return edge;
   }
   
   /**
   * A method for the set edge.
   * @param edgeIn the input for edge.
   * @return Returns a boolean value.
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      return false;
   }
   
   /**
   * A method of height type double which is calculated.
   * @return Returns the value for the calculated height.
   */
   public double height() {
      double height;
      height = Math.sqrt(2 / 3.0) * edge;
      return height;
   }
   
   /**
   * A method containing the calcultions for the surface area.
   * @return Returns the surface area.
   */
   public double surfaceArea() {
      double surfaceArea;
      surfaceArea = Math.sqrt(3) * (edge * edge);
      return surfaceArea;
   }
   /**
   * A method that calculates the volume of the tetrahedron.
   * @return Returns the volume calculation.
   */
   public double volume() {
      double volume;
      volume = (Math.pow(edge, 3)) / (6 * Math.sqrt(2));
      return volume;
   }
   /** 
   * The toString method giving the layout and framework for the output.
   * @return Returns the desired output.
   */
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0##");
      String output = "Tetrahedron \"" + label + "\" with six edges of length "
         + edge + " has:\n"
         + "\theight = " + fmt1.format(height()) + " units\n"
         + "\tsurface area = " + fmt1.format(surfaceArea()) + " square units\n"
         + "\tvolume = " + fmt1.format(volume()) + " cubic units";
      return output;
   }
   /**
   * A method that gets the count.
   * @return Returns the value for the count.
   */
   public static int getCount() {
      return count;
   }
  /**
  * Method that resets the count back to zero.
  */ 
   public static void resetCount() {
      count = 0;
   }
   /** 
   * The equals method that is used in JUnit for testing.
   * @param obj the Object.
   * @return Returns a boolean value.
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      }
      else { 
         Tetrahedron d = (Tetrahedron) obj; 
         return (label.equalsIgnoreCase(d.getLabel())
            && Math.abs(edge - d.getEdge()) < .000001);
      } 
   }
   /**
   * Method for the hashCode which is required by checckstyle.
   * @return Returns 0.
   */         
   public int hashCode() {
      return 0;
   }
   /**
   * The compare to method giving positive negative or zero values.
   * @param obj the tetrahedron object.
   * @return Returns the value based on positive, negative, or zero.
   */
   public int compareTo(Tetrahedron obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.00001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }         
}