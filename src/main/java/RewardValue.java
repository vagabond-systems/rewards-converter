public class RewardValue {
    private double cashValue; // Cash value in dollars
    private double milesValue; // Miles value

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue); // Convert cash to miles
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue); // Convert miles to cash
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash to miles at a rate of 0.0035 per mile
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Convert miles to cash at a rate of 0.0035 per mile
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
}
