public class RewardValue {
    double cash;
    double miles;

    public RewardValue(double cashValue){
        cash = cashValue;
        miles = cashValue / 0.0035;
    }

    public RewardValue(int mileValue){
        miles = mileValue;
        cash = mileValue * 0.0035;

    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return (int)miles;
    }
}
