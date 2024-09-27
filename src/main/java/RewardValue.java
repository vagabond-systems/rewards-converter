/**
 * A class for RewardValue which will convert miles into a cash value and visa versa.
 */
public class RewardValue {
  private final double cashValue;
  private static final double CONVERSION_RATE = 0.0035;

  /**
   * Creates a RewardValue object given a cash value.
   * 
   * @param cash a cash value of type double
   */
  public RewardValue(double cash) {
    this.cashValue = cash;
  }

  /**
   * Creates a RewardValue object given an integer for miles.
   * 
   * @param miles a miles value of type int
   */
  public RewardValue(int miles) {
    this.cashValue = convertToCash(miles);
  }

  /**
   * Returns the cash equivalent to the passed miles value.
   * 
   * @param miles a miles value of type int
   * @return the cash value
   */
  private static double convertToCash(int miles) {
    return miles * CONVERSION_RATE;
  }

  /**
   * Returns the miles equivalent to the passed cash value.
   * 
   * @param cash a cash value of type double
   * @return the miles value
   */
  private static int convertToMiles(double cash) {
    return (int)(cash / CONVERSION_RATE);
  }

  /**
   * Getter method for the object's cash value.
   * 
   * @return the cash value of type double
   */
  public double getCashValue() {
    return this.cashValue;
  }

  /**
   * Getter method for the object's miles value.
   * 
   * @return the miles value of type int
   */
  public int getMilesValue() {
    return convertToMiles(this.cashValue);
  }
}
