public class RewardValue {
     double cashValue;
     double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
    private double convertCashToMiles(double cash) {
        return cash / 0.0035;
    }
}