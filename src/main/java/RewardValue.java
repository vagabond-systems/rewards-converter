public class RewardValue {
    private double CashValue;
    private double MilesValue;


    public RewardValue(double cashValue) {
        this.CashValue = cashValue;
        this.MilesValue = cashValue/0.0035;

    }

    public RewardValue(long milesValue) {
        this.MilesValue = milesValue;
        this.CashValue = milesValue*0.0035;

    }


    public double getCashValue() {
        return CashValue;
    }

    public double getMilesValue() {
        return MilesValue;
    }
}
