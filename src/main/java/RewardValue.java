
public class RewardValue {
    private double cash;
    private int miles;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        if(cash < 0) {
            throw new IllegalArgumentException("Cash value must be positive");
        }
        this.cash = cash;
    }

    public RewardValue(int miles) {
        if(miles < 0) {
            throw new IllegalArgumentException("Miles value must be positive");
        }
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public int getMilesValue() {
        return (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCash() {
        return cash;
    }

    public int getMiles() {
        return miles;
    }

}
