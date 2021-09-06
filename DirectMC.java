import java.text.DecimalFormat;
/**
* The program subclass DirectMC of Marketing Campaign.
*
* M9: Project_09
* @author James Glass COMP-1213-001
* @version 4/01/21
*/

public class DirectMC extends MarketingCampaign {
/**
* Has fields, a constructor, and methods extends the Marketing Campaign.
*/
   
   // Fields
   private double costPerMailPiece;
   private int numberOfMailPieces;
   /**
   * The Base Cost in DirectMC.
   */
   public static final double BASE_COST = 1000;
   
   // Constructor
   /**
   * The constructor for DirectMC.
   * @param nameIn the input.
   * @param revenueIn the input value.
   * @param costPerMailPieceIn the input.
   * @param numberOfMailPiecesIn the input.
   */
   public DirectMC(String nameIn, double revenueIn, 
      double costPerMailPieceIn, int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   
   }
   
   //Methods 
   /**
   * The method for getting the cost.
   * @return the double value.
   */
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   
   /**
   * The method for setting the cost per mail piece.
   * @param costPerMailPieceIn the input.
   */
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   
   /**
   * The method for getting the number of mail pieces.
   * @return The number int.
   */
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   
   /**
   * The method for setting the number mail pieces.
   * @param numberOfMailPiecesIn the input.
   */
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
   /**
   * The method for calculating the campaign cost.
   * @return the calculated value.
   */
   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
   }
   
   /**
   * The toString method.
   * @return the desired output.
   */
   public String toString() {
      DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\n   Base Cost: " 
         + fmt1.format(BASE_COST) 
         + "\n   Mail Cost: " 
         + fmt1.format(getCostPerMailPiece() * getNumberOfMailPieces()) 
         + " = " + fmt1.format(getCostPerMailPiece()) + " per mail piece * "
         + getNumberOfMailPieces() + " mail pieces";
      return output;
   }
}
