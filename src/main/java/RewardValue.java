public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        convertCashToMiles();
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        convertMilesToCash();
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public void convertMilesToCash() {
        double conversionRate = 0.0035;
        cashValue = milesValue * conversionRate;
    }

    public void convertCashToMiles() {
        double conversionRate = 0.0035;
        milesValue = (int) (cashValue / conversionRate);
    }
}

