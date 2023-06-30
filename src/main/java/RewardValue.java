public class RewardValue {
  // Declare a private instance variable to hold our current cashValue
  private final double cashValue;
  // Declare a public static constant to access the mile to cash conversion rate
  public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

  // Constructor method that assigns the value of the parameter cashValue to the
  // private instance variable cashValue declared above
  public RewardValue(double cashValue) {
    this.cashValue = cashValue;
  }

  // Constructor method that takes in a parameter milesValue and invokes the
  // convertMilesToCash method to generate a cashValue if given a milesValue
  public RewardValue(int milesValue) {
    this.cashValue = convertMilesToCash(milesValue);
  }

  // Private static method to calculate the cash value based of the given integer
  // milesValue.
  private static double convertMilesToCash(int milesValue) {
    return milesValue * MILES_TO_CASH_CONVERSION_RATE;
  }

  // Private static method to calculate the miles value based of the given double
  // cashValue.
  // It casts the return value to an int before returning the result.
  private static int convertCashToMiles(double cashValue) {
    return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
  }

  // Public instance method that returns the current value of cashValue
  public double getCashValue() {
    return cashValue;
  }

  // Public instance method that returns the milesValue based on the current
  // cashValue.
  public int getMilesValue() {
    return convertCashToMiles(this.cashValue);
  }
}