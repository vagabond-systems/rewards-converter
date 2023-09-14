public class RewardValue {
    private double cashValue;
    private int milesValue;

    //constructor that accepts a cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    //constructor that accepts a miles value
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue =  milesValue * 0.0035;
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return milesValue;
    }



}
