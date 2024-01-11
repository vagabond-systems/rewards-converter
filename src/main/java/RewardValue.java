public class RewardValue {
    private int miles;
    private final double cash_value; //Add final keyword to ensure immutability
    public static final double MILES_TO_CASH_CONVERSION_RATE = .0035; //Use a clearer naming convention

    //Constructor - accepts cash value
    public RewardValue(double cash_value){
        this.cash_value = cash_value;
        this.miles = getMilesValue();
    }
    //Constructor - accepts miles
    public RewardValue(int miles){
        this.miles = miles;
        this.cash_value = getCashValue();
    }

    // Returns the cash value of the RewardValue.
    public double getCashValue(){
        return this.miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Return how many miles the RewardValue is worth.
    public int getMilesValue(){
        return (int)(this.cash_value / MILES_TO_CASH_CONVERSION_RATE);
    }
}
