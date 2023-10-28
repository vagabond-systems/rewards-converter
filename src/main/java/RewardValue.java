

public class RewardValue {
    private double cash;
    private int miles;

    // Constructor for cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / 0.0035); // Conversion rate: 1 mile = 0.0035 cash
    }

    // Constructor for miles value
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * 0.0035; // Conversion rate: 1 mile = 0.0035 cash
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}
