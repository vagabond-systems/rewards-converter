public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue (double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue (double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = isMiles ? milesToCash(milesValue) : 0.0;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    public double milesToCash(double miles) {
        return miles * 0.0035;
    }
}
