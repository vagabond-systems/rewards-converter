public class RewardValue {

    private double cashValue;
    private int milesValue;
    private static final double CONVERSIONRATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / CONVERSIONRATE);
    }

    public RewardValue(int milesValue, boolean isMiles) {
            if(isMiles) {
                this.milesValue = milesValue;
                this.cashValue = milesValue * CONVERSIONRATE;
            }
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }


}
