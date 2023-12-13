public class RewardValue {
    private static final double CONVERSION_RATE = 0.0035;
    private double cash;
    private long miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(long miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * CONVERSION_RATE;
    }

    public long getMilesValue() {
        return (long)(cash/CONVERSION_RATE);
    }
}



