public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor for creating RewardValue with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Calculate miles value based on some conversion rate, let's assume 100 miles per $1 for now
        this.milesValue = (int) (cashValue * 100);
    }

    // Constructor for creating RewardValue with miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Calculate cash value based on some conversion rate, let's assume $0.01 per mile for now
        this.cashValue = milesValue * 0.01;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return milesValue;
    }
}
