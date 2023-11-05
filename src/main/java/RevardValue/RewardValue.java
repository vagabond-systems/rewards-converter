package RevardValue;

public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }
    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    public double getCashValue() {
        return cashValue;
    }
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }
}

