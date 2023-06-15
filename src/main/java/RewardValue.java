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
        return cashValue;
    }

    public double getMilesValue() {
        double milesToCashRate =  0.0035;
        return this.cashValue *  milesToCashRate;
    }
}
