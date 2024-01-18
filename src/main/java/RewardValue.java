public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor for miles value.");
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

    // Convert cash value to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Convert miles value to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }

    public static void main(String[] args) {
        // Example usage
        RewardValue rewardWithCash = new RewardValue(100.0);
        System.out.println("Cash Value: " + rewardWithCash.getCashValue());
        System.out.println("Miles Value: " + rewardWithCash.getMilesValue());

        RewardValue rewardWithMiles = new RewardValue(35000, true);
        System.out.println("Cash Value: " + rewardWithMiles.getCashValue());
        System.out.println("Miles Value: " + rewardWithMiles.getMilesValue());
    }
}
