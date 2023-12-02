public class RewardValue {
    private double cashValue;
    private int milesValue;


    public  RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        return cashValue/0.0035;
    }

    public double getMilesValue(){
        double value = 0.0035 *cashValue;
        return value;
    }
}
