public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts a value in miles
    public void CashValue(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Getter method to return the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter method to return how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }
}
