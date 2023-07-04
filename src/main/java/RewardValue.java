public class RewardValue {
    private double cashValue;
    private int miles;
    private final double convertMilesToCash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        double cashValue = miles * convertMilesToCash;
        return cashValue;
    }

    public int getMilesValue() {
        int milesValue = (int)(cashValue/convertMilesToCash);
        return milesValue;
    }

}
