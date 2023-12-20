public class RewardValue {
    final double cashValue;
    final double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = isMiles ? milesToCash(milesValue) : 0.0;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
}
