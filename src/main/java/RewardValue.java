public class RewardValue {
    private double cash;
    private long miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(long miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * 0.0035;
    }

    public long getMilesValue() {
        return (long)(cash/0.0035);
    }
}



