

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Helper method to convert miles to cash
    private double convertMilesToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
