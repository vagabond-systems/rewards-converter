public class RewardValue {
    private double cashValue=0;
    private long milesValue=0;
    final double MILES_TO_CASH_RATE = .0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(long milesValue) {
        this.milesValue=milesValue;
    }

    public double getCashValue(){
        if(milesValue!=0){
            cashValue = milesValue/MILES_TO_CASH_RATE;
        }
        return cashValue;
    }

    public long getMilesValue(){
        if(cashValue!=0){
            milesValue = (long) (cashValue* MILES_TO_CASH_RATE);
        }
        return milesValue;
    }
}
