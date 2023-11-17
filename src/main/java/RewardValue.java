public class RewardValue {
    private final double cashValue;
    public static final double CONVERSION_RATE = 0.1;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }


    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    private static double convertToCash(int milesaValue) {
        return milesaValue * CONVERSION_RATE;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
    
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
