public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue / MILES_TO_CASH_RATE;
        } else {
            System.out.println("Invalid constructor usage. Please provide miles value.");
        }
    }

    // Method to get the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value of RewardValue
    public double getMilesValue() {
        return milesValue;
    }
}
