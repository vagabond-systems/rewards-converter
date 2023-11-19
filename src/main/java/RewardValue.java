public class RewardValue {
    private final double cashValue;
    private final double MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH);
    }

    public double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
