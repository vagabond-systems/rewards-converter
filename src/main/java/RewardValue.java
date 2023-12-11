public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    /**
     * Converts a cash value into miles for rewards
     * @param cash passed value
     * @return rounded miles
     */
    private int convertCashToMiles(double cash){
        return (int)Math.round(cash * 285.714);
    }

    /**
     * Converts miles to cash value
     * @param miles passed from constructor
     * @return a cash value of these miles
     */
    private double convertMilesToCash(int miles){
        return miles * 0.0035;
    }

}
