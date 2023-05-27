public class RewardValue {
    private final double RATE_CASH_PER_MILES = 0.0035;
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / RATE_CASH_PER_MILES;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * RATE_CASH_PER_MILES;
    }

    public double getCashValue(){ return cashValue;}
    public double getMilesValue(){ return milesValue;}
}
