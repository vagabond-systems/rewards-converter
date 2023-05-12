import java.text.DecimalFormat;

public class RewardValue {
    private double value;
    DecimalFormat d = new DecimalFormat("#.##");

    public RewardValue(double cash) {
        this.value = cash;
    }

    public RewardValue(int miles) {
        this.value = miles * 0.0035;
    }

    public double getCashValue() {
        return value;
    }

    public double getMilesValue() {
        return Double.parseDouble(d.format(value / 0.0035));
    }
}

