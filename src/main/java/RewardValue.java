public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    /**
     * constructor accepts cash and converts to miles
     * @param cashValue accepts input cash value
     */
    RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    /**
     * constructor accepts miles and converts to cash
     * @param milesValue accepts input miles value
     */
    RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
