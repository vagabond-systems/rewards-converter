public class RewardValue {
    private double cashValue;
    private double milesValue;
    
    // Cash constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;  // Convert cash to miles
    }

    // Miles constructor
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;  // Convert miles to cash
    }

    // Getter for cashValue
    public double getCashValue() {
        return this.cashValue;
    }

    // Getter for milesValue
    public double getMilesValue() {
        return this.milesValue;
    }
}


