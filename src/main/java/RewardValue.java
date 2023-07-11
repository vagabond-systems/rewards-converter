import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    private int miles;
    private BigDecimal cash;
    private final BigDecimal CONVERSION_RATE = new BigDecimal("0.0035");

    public RewardValue(BigDecimal cash) {
        this.cash = cash;
        this.miles = cash.divide(CONVERSION_RATE, 0, BigDecimal.ROUND_DOWN).intValue();
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = new BigDecimal(miles).multiply(CONVERSION_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}