public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
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

    public static void main(String[] args) {
        // Test the RewardValue class
        RewardValue reward1 = new RewardValue(100.0); // Cash value constructor
        System.out.println("Cash Value: " + reward1.getCashValue()); // Expected: 100.0
        System.out.println("Miles Value: " + reward1.getMilesValue()); // Expected: 28571.43

        RewardValue reward2 = new RewardValue(50000); // Miles value constructor
        System.out.println("Cash Value: " + reward2.getCashValue()); // Expected: 175.0
        System.out.println("Miles Value: " + reward2.getMilesValue()); // Expected: 50000
    }
}
