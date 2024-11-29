public class RewardValue {
    private final double cashValue;  // Mark as final
    private final double milesValue; // Mark as final

    // Constructor to accept cash value and convert it to miles
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;  // Convert cash to miles
    }

    // Constructor to accept miles value and convert it to cash
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        if (isMiles) {
            this.cashValue = milesValue * 0.0035;  // Convert miles to cash
        } else {
            this.cashValue = 0.0;  // You could set a default if needed
        }
    }

    // Method to return the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to return the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        // Example to test the conversion from cash to miles
        RewardValue rewardValueFromCash = new RewardValue(100.0);  // $100 in cash
        System.out.println("$100 is worth " + rewardValueFromCash.getMilesValue() + " miles.");

        // Example to test the conversion from miles to cash
        RewardValue rewardValueFromMiles = new RewardValue(5000.0, true);  // 5000 miles
        System.out.println("5000 miles is worth $" + rewardValueFromMiles.getCashValue());
    }
}
