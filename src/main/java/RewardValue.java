public class RewardValue {
    
    private double cashValue;
    private int milesValue;

    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = (int) (cash / 0.0035);
    }

    public RewardValue(int miles){
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue(){
        return this.milesValue;
    }

}
