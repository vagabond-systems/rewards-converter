
public class RewardValue {

    int milesValue;
    double cashValue;

    public RewardValue(int miles) {
        this.milesValue = miles;
    }

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double milesToCash(int milesValue) {
        return milesValue*0.0035;
    }

    public int cashToMiles(double cashValue) {
        return (int) (cashValue/0.0035);
    }
}
