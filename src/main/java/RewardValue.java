public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion method from cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Conversion method from miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
