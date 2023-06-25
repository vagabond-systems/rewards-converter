public class RewardValue {

    private double cashValue;
    private double convesionFactor= 0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }

    public double getMilesValue(){
        return this.cashValue/convesionFactor;
    }
}