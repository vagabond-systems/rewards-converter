public class RewardValue {

    private double cashValue;
    private int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.miles = cashValue/0.0035;
    }

    public RewardValue(int miles) {
        this.cashValue = miles*0.0035;
        this.miles = miles;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.miles;
    }
}