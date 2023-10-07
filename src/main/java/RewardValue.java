public class RewardValue {
    double cashValue;
    int milesValue;
    double conversionRate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }

    private double convertMilesToCash(double milesValue) {
        return milesValue * conversionRate;
    }

    private int convertCashToMiles(double cashValue) {
        return (int)(cashValue / conversionRate);
    }
}
