public class RewardValue {
    private double cashValue = 0;
    private final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;;
    }

    public RewardValue(int miles) {
      this.cashValue = convertMilesToCash(miles);
    }

    private int convertCashToMiles(double cashValue) {
      return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    private double convertMilesToCash(int miles) {
      return miles * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return convertCashToMiles(cashValue);
    }
}