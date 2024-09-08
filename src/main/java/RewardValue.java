public class RewardValue{

    private final double cash;
    private final double miles;

    // Constructor for cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / 0.0035;
    }

    // Constructor for miles value
    public RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            this.miles = miles;
            this.cash = miles * 0.0035;
        } else {
            throw new IllegalArgumentException("Invalid flag for miles constructor");
        }
    }

    // Getter for cash value
    public double getCashValue() {
        return cash;
    }

    // Getter for miles value
    public double getMilesValue() {
        return miles;
    }
}


