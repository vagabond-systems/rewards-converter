import java.math.BigDecimal;

public class RewardValue {
    double cashValue;
    BigDecimal milesValue;
    protected double rate = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = BigDecimal.valueOf(cashValue / rate);
    }

    public RewardValue(BigDecimal milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue.multiply(BigDecimal.valueOf(rate)).doubleValue();
    }

    public BigDecimal getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}
