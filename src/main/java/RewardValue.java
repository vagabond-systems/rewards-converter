public class RewardValue {
    private double cashValue;
    private double milesValue;
    static private double conversionRate = 0.0035;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion method: miles to cash
    private double convertMilesToCash(double miles) {
        return miles * conversionRate;
    }

    // Conversion method: cash to miles
    private double convertCashToMiles(double cash) {
        return cash / conversionRate;
    }
}
