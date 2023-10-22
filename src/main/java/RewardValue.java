public class RewardValue {
    private double cashValue;
    private double mileValue;
    RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.mileValue=(this.cashValue*(0.0035));
    }
    public double getCashValue(){
        return this.cashValue;
    }
    public double getMilesValue(){
        return this.mileValue;
    }
}
