public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue); // Default miles value
    }

    // Constructor that accepts miles value and converts to cash value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    // Method to convert miles to cash
    private double milesToCash(int miles) {
        return miles * 0.0035;
    }

    private int cashToMiles(double cash){
        return (int) (cash / 0.0035);
    }

    // Getters for cash value and miles value
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

}
