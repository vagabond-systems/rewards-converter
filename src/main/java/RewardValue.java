public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035;
    }

    public int cashToMiles(double cashValue) {
        return (int) (cashValue/0.0035);
    }

    public double milesToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return cashToMiles(this.cashValue);
    }
}
