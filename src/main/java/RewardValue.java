public class RewardValue {
  private final double cashValue;
  private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

  public RewardValue(double cashValue) {
    this.cashValue = cashValue;
  }

  public RewardValue(int milesValue) {
    this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
  }

  public double getCashValue() {
    return cashValue;
  }

  public int getMilesValue() {
    return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
  }
}