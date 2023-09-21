public class RewardValue {

    private int milesValue;

    private double cashValue;

    RewardValue(double cash){
        milesValue = (int) (cash * 0.0035);
        cashValue = cash;
    }

    RewardValue(int miles){
        cashValue = (miles/0.0035);
        milesValue = miles;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}
