public class RewardValue {

    private final double cashValue;
    public final double MILE_TO_CASH_CORVERS_RATE = 0.0035;

    //constructor to accept cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    //constructor to accept airline miles
    public RewardValue(int milesValue){
        this.cashValue =covertToCash(milesValue);
    }

    public double covertToCash(int milesValue) {
        return milesValue * MILE_TO_CASH_CORVERS_RATE;
    }

    public int convertToMiles(double cashValue){
        return (int) (cashValue/MILE_TO_CASH_CORVERS_RATE);
    }

    public Double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}

