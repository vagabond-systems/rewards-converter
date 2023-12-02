public class RewardValue {
    private final double cash;
    public static final double miles_to_cash_conversion_rate = 0.0035;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }

    private static int convertToMiles(double cash) {
        return (int) (cash / miles_to_cash_conversion_rate);
    }

    public static double convertToCash(int miles) {
        return miles * miles_to_cash_conversion_rate;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return convertToMiles(this.cash);
    }
}
