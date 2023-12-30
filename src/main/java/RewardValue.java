public class RewardValue {

    double cashValue;

    public RewardValue(int miles){
        this.cashValue = miles * 0.0035;
    }
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public double getCashValue(){return cashValue;}
    public int getMilesValue(){return (int)(cashValue / 0.0035);}
}