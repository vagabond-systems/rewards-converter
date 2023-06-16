public class RewardValue {
    private double cashValue;
    private int milesValue;
    /** We will now create multiple constructors to create RewardValue
    objects using either cash value or the miles value.
     */

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / 0.0035);
        //
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035;
    }

    public double getCashValue() {
        //This will return cash value of reward after converting
        return cashValue;
    }
    public int getMilesValue(){
        //This will return miles value of reward after converting
        return milesValue;
    }
}
