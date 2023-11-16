public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double CONVERSION_RATE = .0035;

    // Constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public int convertCashToMiles() {
        return (int) (getCashValue() * CONVERSION_RATE);
    }

    public double convertMilesToCash() {
        return (double) (getMilesValue() / CONVERSION_RATE);
    }

    
    
    // two constructors
        // one that accepts cash
        // one that accepts miles
    
    // Methods
        // getCashValue(), returns cash
        // getMilesValue(), returns miles
    // Must convert miles to cash at a rate of 0.0035

}
