/**
 * @author Mendy
 * @create 2023-10-03 18:57
 */
public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(long miles) {
        this.milesValue = miles;
        this.cashValue = miles * CONVERSION_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}
