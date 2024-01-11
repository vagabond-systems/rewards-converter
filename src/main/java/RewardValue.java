public class RewardValue {
    private int miles;
    private final double cashValue; //Add final keyword to ensure immutability
    public static final double MILES_TO_CASH_CONVERSION_RATE = .0035; //Use a clearer naming convention

    //Constructor - accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.miles = getMilesValue();
    }
    //Constructor - accepts miles
    public RewardValue(int miles){
        this.miles = miles;
        this.cashValue = getCashValue();
    }

    // Returns the cash value of the RewardValue.
    public double getCashValue(){
        return this.miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Return how many miles the RewardValue is worth.
    public int getMilesValue(){
        return (int)(this.cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
}
