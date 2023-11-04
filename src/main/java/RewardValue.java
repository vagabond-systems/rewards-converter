public class RewardValue {
    private double value;
    private final double ConverterMilesToCash = 0.0035;

    public RewardValue(double CashValue) {
        this.value = CashValue;
    }

    public RewardValue(int MilesValue) {
        this.value = MilesValue * ConverterMilesToCash;
    }

    public double getCashValue() {
        return value;
    }

    public int getMilesValue() {
        return (int)(value/ConverterMilesToCash) ;
    }

}