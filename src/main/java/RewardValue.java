public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        cashValue = milesValue * 0.0035;
        return cashValue;
    }

    public int getMilesValue() {
        milesValue = (int) (cashValue / 0.0035);
        return milesValue;
    }
}
