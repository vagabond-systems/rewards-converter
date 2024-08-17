public class RewardValue {
    private double cash;
    private int miles;
    private static final float MILES_TO_CASH_RATE = 0.0035f;
    public RewardValue(double cashvalue){
        cash = cashvalue;
        this.miles =(int) (this.cash / MILES_TO_CASH_RATE) ;
    }
    public RewardValue(int milesvalue){
        miles = milesvalue;
        this.cash =  (this.miles*MILES_TO_CASH_RATE);
    }
    float getMilesValue(){
        return this.miles ;
    }
    double getCashValue(){
        return this.cash ;
    }

}
