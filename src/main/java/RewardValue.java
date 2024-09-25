

public class RewardValue {
    private static final double MILES_CONVERSION_RATE = 0.0025;
    private double cashValue;
    private double milesValue;

    // Constructor to initialize with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_CONVERSION_RATE;
    }

    // Constructor to initialize with miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    // Method to convert cash value to miles
    public static double convertCashToMiles(double cashValue) {
        return cashValue / MILES_CONVERSION_RATE;
    }

    // Method to convert miles value to cash
    public static double convertMilesToCash(int milesValue) {
        return milesValue * MILES_CONVERSION_RATE;
    }
}
