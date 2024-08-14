public class RewardValue {
    private double cashValue;

    private static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue =  milesValue * conversionRate;
    }

    public int getMilesValue() {
        return (int) (this.cashValue /conversionRate);
    }
    public double getCashValue(){
        return cashValue;
    }

}
