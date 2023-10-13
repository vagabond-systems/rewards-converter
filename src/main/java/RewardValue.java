public class RewardValue {
    double cashValue;
    long miles;
     public RewardValue(double cashValue){
         this.cashValue = cashValue;
     }
    public RewardValue(long miles){
        this.miles = miles;
    }

    public double getCashValue() {
        return miles/0.0035;
    }
    public double getMilesValue() {
         return cashValue*0.0035;
    }
}
