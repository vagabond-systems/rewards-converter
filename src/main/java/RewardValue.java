public class RewardValue {
    private double cashValue;
    private int milesValue;
    static final double EXCHANGE_RATE = .0035;
    public RewardValue (double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue*(1/EXCHANGE_RATE));
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue*EXCHANGE_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
