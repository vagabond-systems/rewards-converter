public class RewardValue {
    private double cash;
    private double miles;
    private final double MILES_TO_CASH = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = cashValue / MILES_TO_CASH;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.miles = milesValue;
        this.cash = milesValue * MILES_TO_CASH;
    }

    // Returns the cash value of the RewardValue
    public double getCashValue() {
        return cash;
    }
    public double getMilesValue() {
        return miles;
    }






}
