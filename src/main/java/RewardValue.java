public class RewardValue {
private final double CashValue;
private static final double rate=0.0035;
    public RewardValue(double cashValue) {
        CashValue= cashValue;
    }
    public RewardValue(int milesValue) {
        CashValue= convertToCash(milesValue);
    }

    private double convertToCash(int milesValue) {
        return milesValue*rate;
    }

    public int getMilesValue() {
        return  ConvertToMiles(CashValue);
    }

    private int ConvertToMiles(double cashValue) {
        return (int) (CashValue/rate);
    }

    public double getCashValue() {
        return CashValue;

    }
}
