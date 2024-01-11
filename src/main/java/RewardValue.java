public class RewardValue {
    private int milesValue;
    private final double cashValue; //Add final keyword to ensure immutability
    public static final double MILES_TO_CASH_CONVERSION_RATE = .0035; //Use a clearer naming convention

    //Constructor - accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    //Constructor - accepts miles
    public RewardValue(int milesValue){
        this.cashValue = convertToCash(milesValue);
    }

    // Separate conversion logic from getters
    private int convertToMiles(double cashValue){
        return (int)(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private double convertToCash(int milesValue){
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Returns the cash value of the RewardValue.
    public double getCashValue(){
        return cashValue;
    }

    // Return how many miles the RewardValue is worth.
    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}
