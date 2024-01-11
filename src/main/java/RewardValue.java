public class RewardValue {
    private int milesValue;
    private final double cashValue; //Add final keyword to ensure immutability
    public static final double MILES_TO_CASH_CONVERSION_RATE = .0035; //Use a clearer naming convention

    //Constructor - accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = getMilesValue();
    }
    //Constructor - accepts miles
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = getCashValue();
    }

    // Returns the cash value of the RewardValue.
    public double getCashValue(){
        return this.milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Return how many miles the RewardValue is worth.
    public int getMilesValue(){
        return (int)(this.cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
}
