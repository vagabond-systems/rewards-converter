public class RewardValue {

    double rate = 0.0035f;
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }

    private double cashToMiles(double cashVal) {
        return cashVal / rate;
    }
    private double milesToCash(double milesVal) {
        return milesVal * rate;
    }
}