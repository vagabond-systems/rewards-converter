public class RewardValue {

    private final double cashValue;
    private final int milesValue;
    
    private static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue= (int) ((int) this.cashValue/CONVERSION_RATE);
    }

    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue= milesValue*CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
