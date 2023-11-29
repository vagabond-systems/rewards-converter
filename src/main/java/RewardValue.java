public class RewardValue {
    private double cash;
    private float miles;

    RewardValue(double cash){
        this.cash = cash;
    }
    RewardValue(float miles){
        this.miles = miles;
    }
    public double getCashValue(){
        return cash;
    }
    public float getMilesValue(){
        return (float) (cash / .0035);
    }
}
