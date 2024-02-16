public class RewardValue {
    private final double cashValue;
    public static final double rate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = fromMiles(milesValue);
    }

    private static int toMiles(double cash) {
        return (int) (cash / rate);
    }

    private static double fromMiles(int miles) {
        return miles * rate;
    }

    public int getMilesValue() {
        return toMiles(this.cashValue);
    }

    public double getCashValue() {
        return cashValue;
    }
}
