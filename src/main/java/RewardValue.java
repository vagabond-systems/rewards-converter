public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double MILES_TO_CASH_RATE = 0.0035;

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
            // Handle the case where the user did not provide miles value
            System.out.println("Invalid usage of the constructor. Provide miles value and set 'isMiles' to true.");
        }
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }
}

