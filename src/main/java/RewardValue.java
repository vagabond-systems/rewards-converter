public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value for RewardValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts miles value for RewardValue
    public RewardValue(int milesValues){
        this.milesValue = milesValues;
        this.cashValue = (double) (milesValue * 0.0035);
    }

    // return cashValue
    public double getCashValue(){
        return this.cashValue;
    }

    // return milesValue
    public int getMilesValue(){
        return this.milesValue;
    }


}
