public class RewardValue {

    // Constant for miles to cash conversion rate
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Variables to store cash and miles values
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Testing the RewardValue class with cash value
        RewardValue rewardFromCash = new RewardValue(100); // Example cash value
        System.out.println("Cash: $" + rewardFromCash.getCashValue());
        System.out.println("Miles: " + rewardFromCash.getMilesValue() + " miles");

        // Testing the RewardValue class with miles value
        RewardValue rewardFromMiles = new RewardValue(1000); // Example miles value
        System.out.println("Miles: " + rewardFromMiles.getMilesValue() + " miles");
        System.out.println("Cash: $" + rewardFromMiles.getCashValue());
    }
}
