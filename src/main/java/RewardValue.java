public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    //constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    //constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private static double convertToCash(int milesValue) {
        return (milesValue * MILES_TO_CASH_CONVERSION_RATE);
    }
    //getCashValue() returns cash value of reward value
    public double getCashValue() {
        return cashValue;
    }
    //getMilesValue() returns how many miles the reward value is worth
   public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
