public class RewardValue {
    
    public double cashValue;
    public double milesValue;

    // Constructor that accepts Cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert Cash to Miles
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts Miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Convert Miles to Cash
        this.cashValue = milesValue * 0.0035;
    }

    // Get the Cash value of the Reward value
    public double getCashValue() {
        return cashValue;
    }

    // Get how many miles the reward value is worth
    public int getMilesValue() {
        return (int)milesValue;
    }
}
