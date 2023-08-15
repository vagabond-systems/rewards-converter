public class RewardValue {

    private int milesValue;
    private double cashValue;
    
    RewardValue(double cash){
        this.cashValue = cash;
    }

    RewardValue(int miles){
        this.cashValue = miles*0.0035;
        this.milesValue = miles;
    }

    public double getCashValue(){
        return this.cash;
    }

    public int getMilesValue(){
        return this.miles;
    }
}
