public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion from cash to miles at a rate of 0.0035
    private double convertCashToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Conversion from miles to cash at a rate of 0.0035
    private double convertMilesToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
