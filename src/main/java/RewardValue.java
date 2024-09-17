public class RewardValue {
    private final double cashValue;
    private final int mileValue;
    public final static double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.mileValue = (int) (cashValue/CONVERSION_RATE);
    }
     public RewardValue(int miles) {
        this.mileValue = miles;
        this.cashValue = miles*CONVERSION_RATE;
     }

     public double getCashValue() {
        return cashValue;
     }

     public int getMilesValue() {
        return mileValue;
     }
}
