public class RewardValue {

    private static final double MILES_TO_CASH_RATE = 0.0035;

    private double cash;
    private long miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(long miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return cash / MILES_TO_CASH_RATE;
    }

}