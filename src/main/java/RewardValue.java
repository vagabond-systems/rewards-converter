public class RewardValue {

  public static final double CONVERSION_RATE = 0.0035;

  private double cash;
  private int mile;

  public RewardValue(double cash) {
    this.cash = cash;
    this.mile = (int) convertToMiles(cash);
  }

  public RewardValue(int mile) {
    this.cash = convertToCash(mile);
    this.mile = mile;
  }

  public double getCashValue() {
    return cash;
  }

  public int getMilesValue() {
    return mile;
  }

  private double convertToCash(int milesValue) {
    return milesValue * CONVERSION_RATE;
  }

  private double convertToMiles(double cash) {
    return cash / CONVERSION_RATE;
  }

}
