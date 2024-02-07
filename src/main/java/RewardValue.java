public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = isMiles ? milesToCash(milesValue) : 0;
        if (isMiles) {
            System.out.println("Calculated cash value: " + milesToCash(milesValue));
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

    // Conversion from cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Conversion from miles to cash
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
}