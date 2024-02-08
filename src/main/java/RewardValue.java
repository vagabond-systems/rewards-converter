public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // get the cash value
    public double getCashValue() {
        return cashValue;
    }

    //get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // method to convert cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    //method to convert miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
