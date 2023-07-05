public class RewardValue {
    private double cashValue;
    private int milesValue;

    // 1. Constructor - accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // 2. Constructor - accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }


    // 3. Returns the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // 4. Returns how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }


}
