public class RewardValue {
    double cash;  // Create a class attribute

  // Create a class constructor for the Main class
  public RewardValue(double cashValue) {
    cash = cashValue;  // Set the initial value for the class attribute x
  }

  public double getCashValue() {
    return cash;
  }

  public double getMilesValue() {
    return cash * 0.0035;
  }
}
