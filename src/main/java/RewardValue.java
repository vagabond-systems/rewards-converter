public class RewardValue {
    private final double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    RewardValue(int milesValue){
        this.cashValue = calculateCashValue(milesValue);
    }

    private static double calculateCashValue(double milesValue){
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    private static int calculateMilesValue(double cashValue){
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return calculateMilesValue(cashValue);
    }
}
