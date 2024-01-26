public class RewardValue {
    private final double rate = 0.0035;
    private double cash = 0.0;
    private double miles =0.0;

    public RewardValue(double cash){
        this.miles = cash * rate;
    }
    public RewardValue(float miles) {
        this.cash = miles/rate;
    }

// 1 mile = $0.0035

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}