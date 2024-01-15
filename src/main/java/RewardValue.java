public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035; // Conversion rate from miles to cash

    // Constructor to initialize with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor to initialize with miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Converts cash to miles
    private int convertCashToMiles(double cash) {
        // Inverse the conversion from miles to cash for cash to miles
        return (int)(cash / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Converts miles to cash
    private double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }
}
