import java.math.BigDecimal;

public class RewardValue {

    double cash;
    int miles;
    final static double CONVERSION_RATE = 0.035;


    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / CONVERSION_RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
