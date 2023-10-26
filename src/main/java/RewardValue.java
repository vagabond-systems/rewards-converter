public class RewardValue {
    private double cashValue;
    private int milesValue;
    //constructor to accept a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035) ;

    }
   //constructor to accept a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }
    //method to return cash value
    public double getCashValue() {
        return cashValue;
    }
    //method to return miles value
    public int getMilesValue(){
        return milesValue;
    }
}
