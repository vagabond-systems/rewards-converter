public class RewardValue {
    private final double cash;
    private final int miles;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue( double cash) {
        this.cash = cash;
        this.miles = (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
    }

    public RewardValue( int miles) {
        this.miles = miles;
        this.cash = miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.miles;
    }

}