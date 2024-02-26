public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Convert cash to miles using the specified rate
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035; // Convert miles to cash using the specified rate
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Please use the constructor with cash value.");
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

    public static void main(String[] args) {
        // Example usage:
        RewardValue reward1 = new RewardValue(100.0); // Using cash value constructor
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        RewardValue reward2 = new RewardValue(350.0, true); // Using miles value constructor
        System.out.println("Cash Value: " + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }
}
