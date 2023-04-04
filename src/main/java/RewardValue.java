public class RewardValue {
    private double cashValue;
    private int milesValue;
    public RewardValue(double value){
        this.cashValue = value;
        this.milesValue = (int) (cashValue / 0.0035);
    }
    public RewardValue(int value){
        this.milesValue = value;
        this.cashValue = milesValue * 0.0035;
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return milesValue;
    }

}
