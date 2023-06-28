
public class RewardValue {


    private  double milesValue;
    private double cashValue;

    public RewardValue(double cashValue) {
        this.milesValue = cashValue/0.0035;
        this.cashValue = cashValue;
    }

   public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue*0.0035;

   }

    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

}


