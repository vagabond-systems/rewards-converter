public class RewardValue {

    private final double cashValue;  // Attribute for cash value
    private final double milesValue;  // Attribute for miles value

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue; // Initialize cashValue
        this.milesValue = cashToMiles(cashValue); // Convert cash to miles
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue; // Initialize milesValue
        this.cashValue = milesToCash(milesValue); // Convert miles to cash
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue; // Return the cash value
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue; // Return the miles value
    }

    // Method to convert cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035; // Conversion rate from cash to miles
    }

    // Method to convert miles to cash
    private double milesToCash(double miles) {
        return miles * 0.0035; // Conversion rate from miles to cash
    }
}