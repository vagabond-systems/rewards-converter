public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue){

        this.cashValue = cashValue;
    }

    public RewardValue(int milesvalue){

        this.milesValue = milesvalue;
    }

    public double getCashValue(){

        return milesValue * 0.0035;
    }

    public int getMilesValue(){
        return (int) (cashValue / 0.0035);
    }
}
