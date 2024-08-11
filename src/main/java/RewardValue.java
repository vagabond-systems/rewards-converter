public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        } else {
            this.cashValue = milesValue;
            this.milesValue = cashToMiles(cashValue);
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash value to miles
    private double cashToMiles(double cashValue) {
        return cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Convert miles value to cash
    private double milesToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public static void main(String[] args) {
        // Testing the RewardValue class
        RewardValue rewardFromCash = new RewardValue(100.0);
        System.out.println("Cash Value: " + rewardFromCash.getCashValue()); // 100.0
        System.out.println("Miles Value: " + rewardFromCash.getMilesValue()); // 28571.43

        RewardValue rewardFromMiles = new RewardValue(50000.0, true);
        System.out.println("Cash Value: " + rewardFromMiles.getCashValue()); // 175.0
        System.out.println("Miles Value: " + rewardFromMiles.getMilesValue()); // 50000.0
    }
}
