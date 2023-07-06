
public class RewardValue {

    //Variable declaration
    private int miles;
    private double cash;
    private final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / CONVERSION_RATE);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}