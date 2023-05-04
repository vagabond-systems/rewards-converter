import java.lang.Math;

public class RewardValue {
    private int miles;
    private double cash;

    public RewardValue(int milesVal){
        miles = milesVal;
        cash = miles * 0.0035;
    }

    public RewardValue(double cashVal){
        cash = cashVal;
        miles = (int) Math.round(cash / 0.0035);
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }

}
