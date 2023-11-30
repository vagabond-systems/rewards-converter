import java.math.BigDecimal;

public class RewardValue {
    private double cash = 0.0;
    private int miles = 0;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return this.miles;
    }

    public double convertMilesToCash() {
        return this.miles / 0.0035;
    }

    public int convertCashToMiles() {
        return (int)(this.cash * 0.0035);
    }
}
