public class RewardValue {
    private double cashValue;
    private int milesValue;

   //cashValue constructor
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    //milesValue constructor
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }


    //getter method returns cashValue
    public double getCashValue() {
        return cashValue;
    }
//getter method returns milesValue
    public int getMilesValue() {
        return milesValue;
    }


public void convertFromMilesToCash() {
    this.milesValue = (int) (cashValue / 0.0035);
    }
public void convertFromCashToMiles() {
   this.cashValue = milesValue * 0.0035;
   }
}