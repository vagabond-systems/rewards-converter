public class RewardValue {
    private double cashValue;
    private int milesValue;

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        double cashToMilesRate = 0.0035;
        return this.milesValue * cashToMilesRate;
    }

    public double getMilesValue() {
        double milesToCashRate =  0.0035;
        return this.cashValue * milesToCashRate;
    }
}
