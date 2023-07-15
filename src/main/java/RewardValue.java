public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Converts cash value to miles
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    // Converts miles value to cash
    private double convertMilesToCash(int milesValue) {
        return milesValue * 0.0035;
    }
}

