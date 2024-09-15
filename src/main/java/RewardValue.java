public class RewardValue {
    private double cashValue;
    private int milesValue;
    private double milesToCash = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / milesToCash);
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesToCash * milesValue;
    }

    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return milesValue;
    }
}
