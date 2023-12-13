
public class RewardValue {
    
    double cashValue;
    int milesValue;
    double conversionRate = 0.0035;

    public RewardValue( double cash){
       this.cashValue = cash;
       this.milesValue = 0;
    }

    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = 0;
    }

    public double getCashValue(){
        this.cashValue = this.milesValue / conversionRate;
        return this.cashValue;
    }

    public int getMilesValue(){
        this.milesValue = (int) Math.round(this.cashValue * conversionRate);
        return this.milesValue;
    }

}