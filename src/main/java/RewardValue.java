public class RewardValue {

  private static final double MILES_TO_CASH_RATE = 0.0035;
  private double cashValue;
  private double milesValue;

  // Constructor that accepts a value in cash values
  public RewardValue(double cashValue) {
    this.cashValue = cashValue;
    this.milesValue = cashValue / MILES_TO_CASH_RATE; // Convert cash to miles
  }

  // Constructor that accepts a value in miles
  public RewardValue(int milesValue) {
    this.milesValue = milesValue;
    this.cashValue = milesValue * MILES_TO_CASH_RATE; // Convert miles to cash
  }

  public double getCashValue() {
    return cashValue;
  }

  public double getMilesValue() {
    return milesValue;
  }

}
