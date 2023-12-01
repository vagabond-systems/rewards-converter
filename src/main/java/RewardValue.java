public class RewardValue {

    private final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private double cashValue;
    private int milesValue;

    public RewardValue(double cash) {
        milesValue = (int) (cash / MILES_TO_CASH_CONVERSION_RATE);
        cashValue = cash;
    }

    public RewardValue(int miles) {
        milesValue = miles;
        cashValue = miles * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
