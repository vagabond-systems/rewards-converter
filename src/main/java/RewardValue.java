public class RewardValue {

    private double cash;

    private float miles;

    public RewardValue(double cash) {
        mileageMath(cash);
        this.cash = cash;
    }
    public RewardValue(float miles) {
        cashMath(miles);
        this.miles = miles;
    }

    public RewardValue(double cash, float miles) {
        this.cash = cash;
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public void setCashValue(double cash) {
        this.cash = cash;
    }

    public float getMilesValue() {
        return miles;
    }

    public void setMilesValue(float miles) {
        this.miles = miles;
    }

    public float mileageMath(double cash){
        miles = (float) (cash * .0035);
        return miles;
    }

    public double cashMath(float miles) {
        cash = miles / .0035;
        return cash;
    }
}
