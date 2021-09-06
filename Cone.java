import java.text.DecimalFormat;
/**
* A program of the cone class which contains fields, a constuctor, and methods 
* that perform claculations.
*
* M5: Project_05
* @author James Glass COMP-1213-001
* @version 2/17/21
*/ 

public class Cone {

// Fields
   private String label = "";
   private double height = 0;
   private double radius = 0;

// Constructor
/**
* Sets the constuctor of the class.
* @param labelIn user inputs label.
* @param heightIn gets user input height.
* @param radiusIn gets user input radius. 
*/
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }

// Get and Set Methods

/**
* Sets the getLabel method.
* @return Returns the label.
*/
   public String getLabel() {
      return label;
   }
   
   /**
   * The set label method.
   * @return Returns user input labelIn.
   * @param labelIn of user.
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn == null) {
         isSet = false;
      }
      else {
         label = labelIn.trim();          
         isSet = true;
      }
      return isSet;
   }
   /**
   * The get height method.
   * @return Returns a double reprensenting the height field.
   */
   public double getHeight() {
      return height;
   }
   /**
   * The setHeight method based off of user input.
   * @param heightIn Accepts the double height parameter.
   * @return Returns a boolean.
   */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn; 
         return true;
      }  
      else {
         return false;
      }
   }
   /**
   * The getRadius method.
   * @return Returns double radius.
   */
   public double getRadius() {
      return radius;
   }
   /**
   * The setRadius method based off of user input.
   * @param radiusIn the users input radius.
   * @return Returns boolean.
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
     
   /**
   * Sets basePerimeter method.
   * @return Returns perimeter.
   */
   public double basePerimeter() {
      double perimeter = 2 * Math.PI * radius;
      return perimeter;
   }
   
   /**
   * Gives the baseArea method based off of radius.
   * @return Returns the area calculation.
   */
   public double baseArea() {
      double area = Math.PI * radius * radius;
      return area;
   }
    
   /**
   * Gives the slant height method calculated using height and radius.
   * @return Returns calculation for the slant height.
   */
   public double slantHeight() {
      double slantHeight = Math.sqrt((radius * radius) + (height * height));
      return slantHeight;
   }
      
   /**
   * Gives the calculation for side area using the slant height and radius.
   * @return Returns the side area calculation.
   */
   public double sideArea() {
      double sidearea = Math.PI * radius * slantHeight();
      return sidearea;
   }
     
   /**
   * Calculates the surface area using the base and height areas.
   * @return Returns the calculation for the total surface area.
   */
   public double surfaceArea() {
      double surfaceArea = (Math.PI * radius) * (radius + slantHeight());
      return surfaceArea;
   }
   
   /**
   * Calculates the volume using the height and radius.
   * @return Returns the volume calculation.
   */
   public double volume() {
      double volume = (Math.PI * radius * radius) * (height / 3);
      return volume;
   }

/**
* Gives the string output.
* @return Returns the information about the cone.
*/
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0##");
      return "\"" + label + "\" is a cone with height = "
         + fmt1.format(height) + " units and radius = "
         + fmt1.format(radius) + " units,\n"
         + "which has base perimeter = "
         + fmt1.format(basePerimeter())
         + " units, base area = " 
         + fmt1.format(baseArea()) + " square units,\n"
         + "slant height = " + fmt1.format(slantHeight())
         + " units, side area = "
         + fmt1.format(sideArea()) + " square units,\n"
         + "surface area = " + fmt1.format(surfaceArea()) 
         + " square units, and volume = " + fmt1.format(volume())
         + " cubic units.";
   }
}
