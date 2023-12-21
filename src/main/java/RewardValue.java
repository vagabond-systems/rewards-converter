public class RewardValue {
    private double cashValue;
    private double milesValue;

    //Constructor that accepts miles value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    //Constructor that accepts mies value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    //Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    //Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    //Convert miles to cash at a rate of 0.0035
    private double convertToCash(double miles) {
        return miles * 0.0035;
    }

    //Convert cash to miles at a rate of 0.0035
    private double convertToMiles(double cash) {
        return cash / 0.0035;
    }
}


