public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    private final double MILES_TO_CASH_RATE = 0.0035;
    // 1 mile = $0.0035

    RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }
    RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    private double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }
    private int convertToMiles(double cashValue) {
        return (int)(cashValue / MILES_TO_CASH_RATE);
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }
}
