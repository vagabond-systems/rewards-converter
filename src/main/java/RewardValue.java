
class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    // Conversion rate from miles to cash
    private double convertToCash(double miles) {
        return miles * 0.0035;
    }

    // Conversion rate from cash to miles
    private double convertToMiles(double cash) {
        return cash / 0.0035;
    }
}