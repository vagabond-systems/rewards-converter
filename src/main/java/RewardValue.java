public class RewardValue {

    double cash;
    public static final double CURRENCY_CONVERSION = 0.0035; // Conversion from miles to cash

    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles) {
        this.cash = miles * CURRENCY_CONVERSION;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return (int) (cash / CURRENCY_CONVERSION);
    }

}
