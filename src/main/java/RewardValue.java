public class RewardValue {
    private static final double MilesToCash = .0035;
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue/MilesToCash;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * MilesToCash;
    }
    public double getCashValue(){
        return cashValue;
    }
    public double getMilesValue(){
        return milesValue;
    }
}
