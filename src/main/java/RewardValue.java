public class RewardValue {
    private int miles;
    private double cash_value;
    public static final double CONVERSION_RATE = .0035;

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
        return this.miles * CONVERSION_RATE;
    }

    // Return how many miles the RewardValue is worth.
    public int getMilesValue(){
        return (int)(this.cash_value / CONVERSION_RATE);
    }
}
