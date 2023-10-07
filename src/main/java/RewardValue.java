import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {
  private final BigDecimal value;

  private static final BigDecimal milesToCashMultiplier = new BigDecimal("0.0035");

  public RewardValue(int miles) {
    this.value = new BigDecimal(miles).multiply(milesToCashMultiplier);
  }

  public RewardValue(double cash) {
    this.value = new BigDecimal(cash);
  }

  public double getCashValue() {
    return this.value.doubleValue();
  }

  public int getMilesValue() {
    return this.value.divide(milesToCashMultiplier, RoundingMode.DOWN).intValue();
  }
}
