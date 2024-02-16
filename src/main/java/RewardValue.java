public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public void setCashValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        // Assuming 1 dollar = 1 mile for simplicity
        return cashValue;
    }
}
