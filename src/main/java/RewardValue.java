public class RewardValue {
    private double cashValue;
    private double rewardsValue;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.rewardsValue = cashValue / CASH_TO_MILES_CONVERSION_RATE;
    }

    // Constructor for rewards value
    public RewardValue(int rewardsValue) {
        this.rewardsValue = rewardsValue;
        this.cashValue = rewardsValue * CASH_TO_MILES_CONVERSION_RATE;
    }

    // Get cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Get rewards value
    public double getMilesValue() {
        return this.rewardsValue;
    }

}
