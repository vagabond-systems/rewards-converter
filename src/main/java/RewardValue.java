
public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Getter for cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter for milesValue
    public double getMilesValue() {
        return milesValue;
    }
}
