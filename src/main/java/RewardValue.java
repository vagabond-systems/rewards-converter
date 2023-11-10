import java.math.BigDecimal;

public class RewardValue {

    private double cash;
    private int miles;
    private final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = miles * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        miles = (int) (cash / MILES_TO_CASH_RATE);
        return miles;
    }

}
