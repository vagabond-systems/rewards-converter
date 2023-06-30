public class RewardValue {
    private double cashValue;
    private int milesValue;

    RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = (int) (cash/0.0035);
    }

    RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = (double) miles*0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
