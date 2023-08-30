public class RewardValue {

    public double cashValue;
    public double milesValue;
    public static final double conversionRate = 0.0035;

    // Constructor that accepts Cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert Cash to Miles
        this.milesValue = cashValue / conversionRate;
    }

    // Constructor that accepts Miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Convert Miles to Cash
        this.cashValue = milesValue * conversionRate;
    }

    // Get the Cash value of the Reward value
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the reward value is worth
    public int getMilesValue() {
        return (int) milesValue;
    }
}
