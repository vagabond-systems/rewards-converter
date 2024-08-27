public class RewardValue{
    private double cashValue;
    private double milesValue;
    
    private static final double milesToCashConversion = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / milesToCashConversion;
    }


    public double getCashValue(){
        return cashValue;
}
    public double getMilesValue(){
        return milesValue;
    }
    

}
