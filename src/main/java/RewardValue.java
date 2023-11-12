public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Method to convert miles to cash
    private double convertToCash(double miles) {
        return miles * 0.0035;
    }

    // Method to convert cash to miles
    private double convertToMiles(double cash) {
        return cash / 0.0035;
    }
}
