import java.util.ArrayList;
import java.text.DecimalFormat;
/**
* A program containing the ConeList class which has fields, constructors, and 
* methods representing Cone objects.
*
* M5: Project_05
* @author James Glass
* @version 2/17/21
*/
public class ConeList {
/**
* Class that stores the name of list and an ArrayList of cone objects.
* @param args Command line args (not used).
*/

// Fields
   private String list;
   private ArrayList<Cone> coneList;

// Constructor

/**
* The constructor of string and arraylist.
* @param listIn Gives list input.
* @param coneListIn gives arraylist input.
*/
   public ConeList(String listIn, ArrayList<Cone>coneListIn) {
      coneList = coneListIn;
      list = listIn; 
   }
   
// Methods

/**
* Creates the getName method.
* @return Returns a string representing the name of the list.
*/
   public String getName() { 
      return list;
   }

/**
* The numberOfCones method of Cone objects in the list.
* @return Return an int representing the number of Cone objects 
* in the cone list.
*/
   public int numberOfCones() {
      return coneList.size();
   }
   
   /**
   * Method for the totalBasePerimeter.
   * @return Returns the double of total base perimeter in all Cone objects 
   * in the list.
   */
   public double totalBasePerimeter() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).basePerimeter();
         index++;
      }
      return total;
   }
   
   /**
   * Method for the total base area.
   * @return Returns double of total base area in all Cone objects of list.    
   */
   public double totalBaseArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).baseArea();
         index++;
      }
      return total;
   }
   
   /**
   * Method for the total slant height.
   * @return Returns double for total slant height of all Cone objects of list.
   */
   public double totalSlantHeight() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).slantHeight();
         index++;
      }
      return total;
   }
   
   /**
   * Method for the total side area.
   * @return Returns the total side area of all Cone objects in the list.
   */
   public double totalSideArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).sideArea();
         index++;
      }
      return total;
   }

   /** 
   * Method for the total surface area.
   * @return Returns the total surface of  all Cone objects in the list.
   */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
   * Method for the total volume.
   * @return Returns the total volume of all Cone objects in the list.
   */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).volume();
         index++;
      }
      return total;
   }
   
   /**
   * Method for the average surface area.
   * @return Returns the average surface area of all Cone objects in the list.
   */
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).surfaceArea();
         index++;
      }
      if (index == 0) {
         total = 0;
      }
      else {
         total = total / index;
      }
      return total;
   }
   
   /**
   * Method for the average volume.
   * @return Returns the average volume of all Cone objects in the list.
   */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      while (index < coneList.size()) {
         total += coneList.get(index).volume();
         index++;
      }
      if (index == 0) {
         total = 0;
      }
      else {
         total = total / index;
      }
      return total;
   }
   
   /**
   * A String containing the name of the list followed 
   * by each Cone in the ArrayList.
   * @return Returns the result.
   */
   public String toString() {
      String result = list + "\n";
      int index = 0;
      while (index < coneList.size()) {
         result += "\n" + coneList.get(index) + "\n";
         index++;
      }
      return result;
   }
   
   /**
   * Method for the summary of the cone information.
   * @return Returns the result.
   */
   public String summaryInfo() {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + fmt1.format(totalBasePerimeter());
      result += "\nTotal Base Area: " + fmt1.format(totalBaseArea());
      result += "\nTotal Slant Height: " + fmt1.format(totalSlantHeight());
      result += "\nTotal Side Area: " + fmt1.format(totalSideArea());
      result += "\nTotal Surface Area: " + fmt1.format(totalSurfaceArea());
      result += "\nTotal Volume: " + fmt1.format(totalVolume());
      result += "\nAverage Surface Area: " + fmt1.format(averageSurfaceArea());
      result += "\nAverage Volume: " + fmt1.format(averageVolume());
      return result;
   }
}