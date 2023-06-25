public class RewardValue {

    private double cashValue;
    private int milesValue;
    private double convesionFactor= 0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=(int) cashValue/convesionFactor;
    }

    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue= milesValue * convesionFactor;
    }

    public int getMilesValue(){
        return this.milesValue;
    }

    public double getCashValue(){
        return  this.cashValue;
    }
}