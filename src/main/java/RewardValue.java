public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void convertFromCashToMiles() {
        this.milesValue = cashValue / 0.0035;
    }


    public void convertFromMilesToCash() {
        this.cashValue = milesValue * 0.0035;
    }
}
