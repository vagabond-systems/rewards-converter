public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue/0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
//        return milesValue * 0.0035;
    }

    public int getMilesValue() {
        return milesValue;
//        return (int) (cashValue/0.0035);
    }
}
