public class RewardValue {
    private double cashValue;
    private final double conversionRate = 0.0035;

    public RewardValue(double cash){
        this.cashValue = cash;
    }

    public RewardValue(int miles){
        this.cashValue = miles * conversionRate;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public int getMilesValue(){
        return (int) (this.cashValue / conversionRate);
    }
}
