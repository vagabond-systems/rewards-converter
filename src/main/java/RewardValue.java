public class RewardValue {

    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public int getMilesValue() {
        return milesValue;
    }

    // Helper method to convert cash to miles
    private int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    // Helper method to convert miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
