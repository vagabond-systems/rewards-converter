import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {
    private int miles;
    private double cash;
    private final double RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public int getMilesValue() {
        return this.miles;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesToCash() {
        BigDecimal bd = new BigDecimal(this.miles * RATE).setScale(2, RoundingMode.DOWN);
        return bd.doubleValue();
    }

    public int getCashToMiles() {
        return (int) (this.cash / RATE);
    }
}
