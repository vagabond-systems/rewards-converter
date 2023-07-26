public class RewardValue {
    double conversionRate = 0.0035;
    double cash;
    double miles;

    public RewardValue (double cashValue){
         cash = cashValue;
         miles = cashValue / conversionRate;
    }

    public double getCashValue(){
        return this.cash;
    }

    public double getMilesValue(){
        return this.miles;
    }
}
