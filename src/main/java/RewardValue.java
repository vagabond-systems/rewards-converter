public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if(isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        } else {
            throw new IllegalArgumentException("Invalid constructor call: please provide miles value");
        }
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }
}
