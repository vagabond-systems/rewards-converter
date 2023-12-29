public class RewardValue {
    //our two values
    private double cashValue;
    private double milesValue;

    //conversion from miles to cash
    private static final double conversion = 0.0035;

    //constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversion;
    }
    public RewardValue(double value, boolean isMiles) {
        if (isMiles) {
            this.milesValue = value;
            this.cashValue = value * conversion;
        } else {
            // If not explicitly set as miles, treat it as cash
            this.cashValue = value;
            this.milesValue = value / conversion;
        }
    }

    //getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

}
