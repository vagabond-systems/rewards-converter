public class RewardValue {
    private double cashValue;
    private double mileValue;
    private final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor to accept value in cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.mileValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor to accept value in miles
    public RewardValue(double mileValue, boolean isMiles){
        this.mileValue = mileValue;
        this.cashValue = mileValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return mileValue;
    }
}
