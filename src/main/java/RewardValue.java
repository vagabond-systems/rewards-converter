public class RewardValue {
    private double cashValue=0;
    private int milesValue=0;
    final double MILES_TO_CASH_RATE = .0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.milesValue=milesValue;
    }

    public double getCashValue(){
        if(milesValue!=0){
            cashValue = convertMilesToCash(milesValue);
        }
        return cashValue;
    }

    public int getMilesValue(){
        if(cashValue!=0){
            milesValue = convertCashToMiles(cashValue);
        }
        return milesValue;
    }
    private int convertCashToMiles(double cashValue){
        return (int) (cashValue * MILES_TO_CASH_RATE);
    }
    private double convertMilesToCash(int milesValue){
        return (double) milesValue / MILES_TO_CASH_RATE;
    }
}
