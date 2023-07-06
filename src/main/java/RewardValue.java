public class RewardValue {

    private double cash;
    private int miles;

    public RewardValue(double cashValue) {

        this.cash = cashValue;
        this.miles = (int) (cashValue / 0.0035);
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }


}
