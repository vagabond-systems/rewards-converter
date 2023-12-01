public class RewardValue {
    private double cash;
    private int miles;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }
    
}
