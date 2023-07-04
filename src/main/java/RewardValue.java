public class RewardValue {
    private double cash;
    private int miles;
    private double conversionRate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int)(cash / conversionRate);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * conversionRate;
    }

    public double getCashValue() {
        return cash;
    }
    public int getMilesValue() {
        return miles;
    }
}
