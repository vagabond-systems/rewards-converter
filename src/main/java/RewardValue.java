public class RewardValue {
    private double cash;
    private double miles;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / MILES_TO_CASH_CONVERSION_RATE;
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
