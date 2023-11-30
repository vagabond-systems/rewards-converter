import java.math.BigDecimal;

public class RewardValue {
    private double cash = 0.0;
    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = convertMilesToCash(miles);
    }

    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return convertCashToMiles(this.cash);
    }

    public double convertMilesToCash(int miles) {
        return miles / MILES_TO_CASH_CONVERSION_RATE;
    }

    public int convertCashToMiles(double cash) {
        return (int)(cash * MILES_TO_CASH_CONVERSION_RATE);
    }
}
