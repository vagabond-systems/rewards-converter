public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035; // Conversion rate: 0.0035 miles per dollar
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035; // Conversion rate: 0.0035 miles per dollar
    }

    // Get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }
}
