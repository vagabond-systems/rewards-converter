public class RewardValue {

  private static final double CONVERSION_RATE = 0.0035;

  private double cash;
  private double mile;

  public RewardValue(double cash) {
    this.cash = cash;
    this.mile = convertToMiles(cash);
  }

  public RewardValue(double cash, double mile) {
    this.cash = convertToCash(mile);
    this.mile = mile;
  }

  public double getCashValue() {
    return cash;
  }

  public double getMilesValue() {
    return mile;
  }

  private double convertToCash(double milesValue) {
    return milesValue * CONVERSION_RATE;
  }

  private double convertToMiles(double cash) {
    return cash / CONVERSION_RATE;
  }

}
