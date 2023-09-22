public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Convert cash to miles
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash
    }

    // Getter method for cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for milesValue
    public int getMilesValue() {
        return milesValue;
    }

    @Override
    public String toString() {
        return "Cash Value: $" + cashValue + " | Miles Value: " + milesValue + " miles";
    }

    public static void main(String[] args) {
        // Create an instance using the cash value constructor
        RewardValue cashReward = new RewardValue(50.0);
        System.out.println("Cash Reward: " + cashReward);

        // Create an instance using the miles value constructor
        RewardValue milesReward = new RewardValue(1000);
        System.out.println("Miles Reward: " + milesReward);
    }
}



