public class RewardValue {
    private final double cash_Value;
    public static final double covert_Rate_from_MILES_To_Cash = 0.0035;

    public RewardValue(double cash_Value) {
        this.cash_Value = cash_Value;
    }

    public RewardValue(int miles_Value) {
        this.cash_Value = convertToCash(miles_Value);
    }
    //converts the cash value of the object to miles
    private static int convertToMiles(double cash_Value) {
        return (int) (cash_Value / covert_Rate_from_MILES_To_Cash);
    }
    //converts the miles value of the object to cash and returns the number of miles in cash value for an amount of money.
    private static double convertToCash(int miles_Value) {
        return miles_Value * covert_Rate_from_MILES_To_Cash;
    }

    public double getCashValue() {
        return cash_Value;
    }

    public int getMilesValue() {
        return convertToMiles(this.cash_Value);
    }
}
