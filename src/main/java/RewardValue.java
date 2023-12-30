
public class RewardValue {
    double cash;
    // float miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cash = milesValue*0.0035;
    }

    public double getCashValue() {
        // int milesValue = this.miles;
        // return (double) milesValue/0.0035;
        return this.cash;
    }

    public int getMilesValue() {
        // double cashValue = this.cash;
        return (int) (this.cash/0.0035);
    }
}