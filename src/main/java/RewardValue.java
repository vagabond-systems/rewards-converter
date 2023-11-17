public class RewardValue {

    private double cashValue;
    private double milesValue;


    //constructor that accepts  a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);

    }

    public RewardValue(double milesValue, boolean isMiles) {

        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertToCash(milesValue);

        } else {
            throw new IllegalArgumentException("Invalid constructor usage. Use the constructor with cash value.");
        }
    }


    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return milesValue;
    }


    //Private method to convert cash value to miles
    private double convertToMiles(double cashValue) {
        return cashValue * 0.0035;

    }

    //Private method to convert miles value to cash
    private double convertToCash(double milesValue) {
        return milesValue / 0.0035;

    }
}
