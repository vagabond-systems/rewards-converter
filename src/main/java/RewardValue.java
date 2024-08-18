public class RewardValue {
    private double cashValue;
    private double milesValue;
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
    public int getMilesValue() {
        return (int) milesValue;
    }

    public static void main(String[] args) {
        // Test the class
        RewardValue rewardFromCash = new RewardValue(100.0);
        System.out.println("Cash: " + rewardFromCash.getCashValue()); // 100.0
        System.out.println("Miles: " + rewardFromCash.getMilesValue()); // 28571 (100.0 / 0.0035)

        RewardValue rewardFromMiles = new RewardValue(10000);
        System.out.println("Cash: " + rewardFromMiles.getCashValue()); // 35.0 (10000 * 0.0035)
        System.out.println("Miles: " + rewardFromMiles.getMilesValue()); // 10000
    }
}
