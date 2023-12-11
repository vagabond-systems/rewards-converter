public class RewardValue {
    private double cashValue;
    private int milesValue;
    private double conversion = 0.0035;

    /**
     * Constructor
     * @param cashValue
     */
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    /**
     * Constructor
     * @param milesValue
     */
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    /**
     * For converting miles to cash
     * @return cash value
     */
    public double getCashValue() {
        return (int)Math.round(milesValue * conversion);
    }

    /**
     * For converting cash to miles
     * @return miles value
     */
    public int getMilesValue() {
        return (int)Math.round(cashValue / conversion) ;
    }

    
}
