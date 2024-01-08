

public class RewardValue {

    private final double cashValue;
    private final double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
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
        // Example usage
        RewardValue cashReward = new RewardValue(100.0);
        System.out.println("Cash Value: $" + cashReward.getCashValue());
        System.out.println("Miles Value: " + cashReward.getMilesValue() + " miles");

        RewardValue milesReward = new RewardValue(500);
        System.out.println("Cash Value: $" + milesReward.getCashValue());
        System.out.println("Miles Value: " + milesReward.getMilesValue() + " miles");
    }
}
