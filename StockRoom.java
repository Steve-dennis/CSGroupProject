

/**
 * StockRoom handles most interaction in the program including 
 * food amount and type, and searching related animals
 * Has constructor with inheritance from animal used in MAIN for populating the zoo
 * child of Animals class
 * @author StevenDennis AlexandraSuarez KylerYates AbdouToure 
 *
 */
public class StockRoom extends Animals
{
    private int foodCount;
    private String foodType;
   /**
  * constructor with only inheritance
  * @param animal
  * @param enclosure
  * @param animalCount
  */
    public StockRoom(String animal,String enclosure,int animalCount) {
        super(animal,enclosure,animalCount);
    }
    /**
     * accessor method for foodType
     * @return foodType
     */
    public String getFoodType() {
		return foodType;
	}
    /**
     * mutator method for foodType
     * @param foodType
     */
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
    /**
     * accessor method for foodCount
     * @return foodCount
     */
    public int getFoodCount() {
        return this.foodCount;
    }
    /**
     * mutator method for foodCount
     * @param foodCount
     */
    public void setFoodCount( int foodCount) {
        this.foodCount = foodCount;
    }
    /**
     * constructor used when creating animal objects
     * @param foodCount
     * @param animal
     * @param foodType
     * @param enclosure
     * @param animalCount
     */
    public StockRoom(String animal, String enclosure,int animalCount,int foodCount,String foodType) {
        super(animal,enclosure,animalCount);
        this.foodCount = foodCount;
        this.foodType = foodType;
    }
}
