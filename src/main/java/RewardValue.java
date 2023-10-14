public class RewardValue {
    double cashValue;
    int miles;
     public RewardValue(double cashValue){
         this.cashValue = cashValue;
     }
    public RewardValue(int miles){
        this.miles = miles;
        this.cashValue = miles*0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
         return (int)(cashValue/0.0035);
    }
}
