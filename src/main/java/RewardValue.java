public class RewardValue {

    public double cash;
    public int mile;

    public RewardValue (double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue (int mileValue) {
        this.mile = mileValue;
    }

    public double getCashValue() {
        return mile * 0.0035;
    }

    public double getMilesValue() {
        return cash / 0.0035;
    }

}