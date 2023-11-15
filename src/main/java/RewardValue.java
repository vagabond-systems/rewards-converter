public class RewardValue {
    private double cashValue;
    private int milesValue;

    //accepting cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        //converting cash to miles
        this.milesValue = (int) (cashValue/0.0035);
    }

    // Constructor accepting cash value
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        //converting miles to cash
        this.cashValue = milesValue * 0.0035;
    }

    // Getter method for cash value
    public double getCashValue(){
        return cashValue;
    }

    // Getter method for mies value
    public int getMilesValue(){
        return milesValue;
    }


}
